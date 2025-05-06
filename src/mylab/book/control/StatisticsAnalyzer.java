package mylab.book.control;

import mylab.book.entity.Publication;
import mylab.book.entity.Magazine;
import mylab.book.entity.Novel;
import mylab.book.entity.ReferenceBoook;

import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;

public class StatisticsAnalyzer {

    //Ÿ�Ժ� ��� ���� ���
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

    //���ǹ� ���� ���� ���
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

    //Ư�� ���� ���ǹ� ���� ���
    public double calculatePublicationRatioByYear(Publication[] publications, String year) {
        int count = 0;
        for (Publication pub : publications) {
            String pubYear = pub.getPublishingDate().substring(0, 4); // yyyy-mm-dd �� ������ ����
            if (pubYear.equals(year)) {
                count++;
            }
        }
        return (double) count * 100 / publications.length;
    }

    //���ǹ� Ÿ�� Ȯ��
    private String getPublicationType(Publication pub) {
        if (pub instanceof Novel) {
            return "�Ҽ�";
        } else if (pub instanceof Magazine) {
            return "����";
        } else if (pub instanceof ReferenceBoook) {
            return "����";
        } else {
            return "��Ÿ";
        }
    }

    //��� ���� ���
    public void printStatistics(Publication[] publications) {
        DecimalFormat df = new DecimalFormat("#,###.##");
        System.out.println("===== ���ǹ� ��� �м� =====");
        
        //��� ���� ���
        System.out.println("1. Ÿ�Ժ� ��� ����:");
        Map<String, Double> avgPrice = calculateAveragePriceByType(publications);
        for (String type : avgPrice.keySet()) {
            System.out.println(" - " + type + ": " + df.format(avgPrice.get(type)) + "��");
        }
        System.out.println("");

        //���� ���� ���
        System.out.println("2.���ǹ� ���� ����:");
        Map<String, Double> distribution = calculatePublicationDistribution(publications);
        for (String type : distribution.keySet()) {
            System.out.println(" - " + type + ": " + df.format(distribution.get(type)) + "%");
        }
        System.out.println("");

        //2007�⵵ ���ǹ� ���� ���
        double ratio2007 = calculatePublicationRatioByYear(publications, "2007");
        System.out.println("3.2007�⵵ ���ǹ� ����: " + df.format(ratio2007) + "%");
        System.out.println("=============================");
    }
}