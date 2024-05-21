package _01_OOP.step01_절차지향vs객체지향_캡슐화.step05_캡슐화와접근제어자.ex02;

public class ShoppingCart {
    private static final int MAX = 10;
    private Item[] cart;
    private int cnt;

    public ShoppingCart() {
        cart = new Item[MAX];
    }

    public void addItem(Item item) {
        if(cnt >= 10) {
            System.out.println("장바구니가 가득 찼습니다.");
            return;
        }
        cart[cnt++] = item;
    }

    public void displayItems() {
        System.out.println("장바구니 상품 출력");
        for (Item item : cart) {
            if(item == null)
                break;
            System.out.println("상품명: " + item.getName() + ", 합계: " + item.getTotalPrice());
        }
        System.out.println("전체 가격 합: " + getTotalPrice());
    }

    private int getTotalPrice() {
        int totalPrice = 0;
        for (Item item : cart) {
            if(item == null)
                break;
            totalPrice += item.getTotalPrice();
        }
        return totalPrice;
    }


}
