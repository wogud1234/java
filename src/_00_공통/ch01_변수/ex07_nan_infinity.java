package _00_공통.ch01_변수;

public class ex07_nan_infinity {
    public static void main(String[] args) {

        double y = 0.0;
        double z = 5 / y;
        double k = 5 % y;

        System.out.println(z + 2);		// -> Infinity(무한대)
        System.out.println(k + 2);		// -> NaN(Not a Number)

        if(Double.isInfinite(z) || Double.isNaN(z))
            System.out.println("값 산출 불가");
        else
            System.out.println(z + 2);
    }
}
