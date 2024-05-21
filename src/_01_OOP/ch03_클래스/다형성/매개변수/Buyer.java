package _01_OOP.ch03_클래스.다형성.매개변수;

public class Buyer {

    int money = 1000;
    int bonusPoint = 0;
    Product[] item = new Product[10];
    int cnt = 0;

    void buy(Product p) {
        if(money < p.price) {
            System.out.println("잔액이 부족하여 물건을 살 수 없습니다.");
            return;
        }
        money -= p.price;
        bonusPoint += p.bonusPoint;
        item[cnt++] = p;

        System.out.println(p + "을/를 구입하셨습니다.");
    }
    void summary() {
        int sum = 0;
        String itemList = "";

        for(int i=0 ; i<item.length ; i++) {
            if(item[i]==null) break;
            sum += item[i].price;
            itemList += item[i] + ", ";		// 문자열과 참조변수의 덧셈은 참조변수의 toString()을 호출해서 문자열을 얻어 결합한다.
        }
        System.out.println("구입하신 물품의 총금액은 " + sum + "만원입니다.");
        System.out.println("구입목록: " + itemList);
    }
}
