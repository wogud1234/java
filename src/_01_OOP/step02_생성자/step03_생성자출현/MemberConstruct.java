package _01_OOP.step02_생성자.step03_생성자출현;

public class MemberConstruct
{
    String name;
    int age;
    int grade;

    public MemberConstruct(String name, int age) {
//        System.out.println("this()는 생성자 코드의 첫줄에만 작성할 수 있다.");
        this(name, age, 50);
    }
    public MemberConstruct(String name, int age, int grade) {
        System.out.println("생성자 호출~~~~");
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
}

