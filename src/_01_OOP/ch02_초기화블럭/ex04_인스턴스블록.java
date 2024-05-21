package _01_OOP.ch02_초기화블럭;

class Product {

    static int count = 0;
    int serialNo;

    {
        ++count;
        serialNo = count;
    }

    public Product() {

    }
}

public class ex04_인스턴스블록 {
    public static void main(String[] args) {

        Product p1 = new Product();
        Product p2 = new Product();
        Product p3 = new Product();

        System.out.println("p1의 제품번호(serialNo)은 " +  p1.serialNo);
        System.out.println("p2의 제품번호(serialNo)은 " +  p2.serialNo);
        System.out.println("p3의 제품번호(serialNo)은 " +  p3.serialNo);
        System.out.println("생선된 제품의 수는 모두 " + Product.count + "개 입니다.");
    }
}
