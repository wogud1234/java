package _05_제네릭.level2.step05_제네릭메서드;

public class Main {
    public static void main(String[] args) {

        Integer i = 10;

        Integer obj = (Integer)GenericMethod.objMethod(i);

        Integer t = GenericMethod.<Integer>genericMethod(10);
        String str = GenericMethod.<String>genericMethod("hello");

        System.out.println();

        System.out.println("명시적 타입 인자 전달..");
        Integer boundtedT = GenericMethod.<Integer>boundedGenericMethod(10);
        Double doubleValue = GenericMethod.<Double>boundedGenericMethod(3.14);
        // String str2 = GenericMethod.<String>boundedGenericMethod("abc");     // Number로 제한됨....

        System.out.println("인자로 타입 추론...");
        Integer boundtedT_2 = GenericMethod.boundedGenericMethod(10);
        Double doubleValue_2 = GenericMethod.boundedGenericMethod(3.14);
    }
}
