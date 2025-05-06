package mylab.book.control;

import mylab.book.entity.Magazine;
import mylab.book.entity.Novel;
import mylab.book.entity.Publication;
import mylab.book.entity.ReferenceBoook;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ShoppingCart {
    private List<Publication> items;
    
    public ShoppingCart() {
        items = new ArrayList<>();
    }

    //장바구니 조작 메서드
    //출판물 추가
    public void addItem(Publication item) {
        items.add(item);
        System.out.println("장바구니에 추가됨: " + item.getTitle());
    }

    //출판물 제거
    public boolean removeItem(String title) {
        for (Publication p : items) {
            if (p.getTitle().equals(title)) {
                items.remove(p);
                System.out.println("장바구니에서 제거됨: " + title);
                return true;
            }
        }
        System.out.println("장바구니에 해당 항목 없음: " + title);
        return false;
    }

    //장바구니 내용 출력
    public void displayCart() {
        DecimalFormat df = new DecimalFormat("#,###원");
        System.out.println("");
        System.out.println("==== 장바구니 목록 ====");
        if (items.isEmpty()) {
            System.out.println("장바구니가 비어 있습니다.");
            return;
        }

        for (Publication p : items) {
            System.out.println("- " + p.getTitle() + " " + p.toString());
        }

        int total = calculateTotalPrice();
        int discounted = calculateDiscountedPrice();

        System.out.println("");
        System.out.println("총 가격: " + df.format(total));
        System.out.println("할인 적용 가격: " + df.format(discounted));
    }

    //가격 계산 메서드
    //총 원가 계산
    public int calculateTotalPrice() {
        int total = 0;
        for (Publication p : items) {
            total += p.getPrice();
        }
        return total;
    }

    //할인 적용 총 가격 계산
    public int calculateDiscountedPrice() {
        int total = 0;
        for (Publication p : items) {
            int price = p.getPrice();
            if (p instanceof Magazine) {
                price *= 0.9;  //10% 할인
            } else if (p instanceof Novel) {
                price *= 0.85; //15% 할인
            } else if (p instanceof ReferenceBoook) {
                price *= 0.8;  //20% 할인
            }
            total += price;
        }
        return total;
    }

    //통계 출력 메서드
    public void printStatistics() {
        Map<String, Integer> countByType = new HashMap<>();

        for (Publication p : items) {
            String type = getPublicationType(p);
            countByType.put(type, countByType.getOrDefault(type, 0) + 1);
        }

        System.out.println("");
        System.out.println("==== 장바구니 통계 ====");
        for (String type : countByType.keySet()) {
            System.out.println(type + ": " + countByType.get(type) + "개");
        }
    }

    private String getPublicationType(Publication p) {
        if (p instanceof Magazine) {
            return "잡지";
        } else if (p instanceof Novel) {
            return "소설";
        } else if (p instanceof ReferenceBoook) {
            return "참고서";
        } else {
            return "기타";
        }
    }

    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        cart.addItem(new Magazine("마이크로소프트", "2007-10-01", 328, 9900, "매월"));
        cart.addItem(new Novel("빠삐용", "2007-07-01", 396, 9800, "베르나르베르베르", "현대소설"));
        cart.addItem(new ReferenceBoook("실용주의프로그래머", "2007-01-14", 496, 25000, "소프트웨어공학"));
        cart.addItem(new Novel("소년이온다", "2014-05-01", 216, 15000, "한강", "장편소설"));

        cart.displayCart();
        cart.printStatistics();

        cart.removeItem("빠삐용");

        cart.displayCart();
        cart.printStatistics();
    }
}