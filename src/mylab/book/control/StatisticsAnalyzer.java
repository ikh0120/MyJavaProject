package mylab.book.control;

import mylab.book.entity.Publication;
import mylab.book.entity.Magazine;
import mylab.book.entity.Novel;
import mylab.book.entity.ReferenceBoook;

import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;

public class StatisticsAnalyzer {

    //타입별 평균 가격 계산
    public Map<String, Double> calculateAveragePriceByType(Publication[] publications) {
        Map<String, Integer> totalPriceByType = new HashMap<>();
        Map<String, Integer> countByType = new HashMap<>();

        for (Publication pub : publications) {
            String type = getPublicationType(pub);
            totalPriceByType.put(type, totalPriceByType.getOrDefault(type, 0) + pub.getPrice());
            countByType.put(type, countByType.getOrDefault(type, 0) + 1);
        }

        Map<String, Double> averagePriceByType = new HashMap<>();
        for (String type : totalPriceByType.keySet()) {
            double avg = (double) totalPriceByType.get(type) / countByType.get(type);
            averagePriceByType.put(type, avg);
        }
        return averagePriceByType;
    }

    //출판물 유형 분포 계산
    public Map<String, Double> calculatePublicationDistribution(Publication[] publications) {
        Map<String, Integer> countByType = new HashMap<>();
        int total = publications.length;

        for (Publication pub : publications) {
            String type = getPublicationType(pub);
            countByType.put(type, countByType.getOrDefault(type, 0) + 1);
        }

        Map<String, Double> distribution = new HashMap<>();
        for (String type : countByType.keySet()) {
            double percent = (double) countByType.get(type) * 100 / total;
            distribution.put(type, percent);
        }
        return distribution;
    }

    //특정 연도 출판물 비율 계산
    public double calculatePublicationRatioByYear(Publication[] publications, String year) {
        int count = 0;
        for (Publication pub : publications) {
            String pubYear = pub.getPublishingDate().substring(0, 4); // yyyy-mm-dd 중 연도만 추출
            if (pubYear.equals(year)) {
                count++;
            }
        }
        return (double) count * 100 / publications.length;
    }

    //출판물 타입 확인
    private String getPublicationType(Publication pub) {
        if (pub instanceof Novel) {
            return "소설";
        } else if (pub instanceof Magazine) {
            return "잡지";
        } else if (pub instanceof ReferenceBoook) {
            return "참고서";
        } else {
            return "기타";
        }
    }

    //통계 정보 출력
    public void printStatistics(Publication[] publications) {
        DecimalFormat df = new DecimalFormat("#,###.##");
        System.out.println("===== 출판물 통계 분석 =====");
        
        //평균 가격 출력
        System.out.println("1. 타입별 평균 가격:");
        Map<String, Double> avgPrice = calculateAveragePriceByType(publications);
        for (String type : avgPrice.keySet()) {
            System.out.println(" - " + type + ": " + df.format(avgPrice.get(type)) + "원");
        }
        System.out.println("");

        //유형 분포 출력
        System.out.println("2.출판물 유형 분포:");
        Map<String, Double> distribution = calculatePublicationDistribution(publications);
        for (String type : distribution.keySet()) {
            System.out.println(" - " + type + ": " + df.format(distribution.get(type)) + "%");
        }
        System.out.println("");

        //2007년도 출판물 비율 출력
        double ratio2007 = calculatePublicationRatioByYear(publications, "2007");
        System.out.println("3.2007년도 출판물 비율: " + df.format(ratio2007) + "%");
        System.out.println("=============================");
    }
}