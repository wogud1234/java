package _01_OOP.step01_절차지향vs객체지향_캡슐화.step05_캡슐화와접근제어자.ex02;

public class Main {
    public static void main(String[] args) {

        ShoppingCart cart = new ShoppingCart();

        Item item1 = new Item("마늘", 2000, 2);
        Item item2 = new Item("상추", 3000, 4);

        cart.addItem(item1);
        cart.addItem(item2);

        cart.displayItems();
    }
}
