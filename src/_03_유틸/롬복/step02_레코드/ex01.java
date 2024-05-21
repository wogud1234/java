package _03_유틸.롬복.step02_레코드;

public class ex01 {
    public static void main(String[] args) {

        Person person1 = new Person("winter", "눈송이", 25);
        System.out.println(person1);

        Person person2 = new Person("winter", "눈송이", 25);

        System.out.println("person1.hashCode(): " + person1.hashCode());
        System.out.println("person2.hashCode(): " + person2.hashCode());
        System.out.println(person1.equals(person2));
    }
}
