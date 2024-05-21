package _06_컬렉션프레임워크.app.ex03;

public class Main {
    public static void main(String[] args) {

        Cart cart = new Cart();

        cart.add(new Product("사과", 1000), 1);
        cart.add(new Product("바나나", 500), 1);
        cart.printAll();

        cart.add(new Product("사과", 1000), 2);
        cart.printAll();

        cart.minus(new Product("사과", 1000), 3);
        cart.printAll();
    }
}
