package _01_OOP.step02_생성자.step02_초기화메서드클래스로이동;

public class MemberInit {
    String name;
    int age;
    int grade;

    void initMember(String name, int age, int grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
}
/*
    - this
        : this는 인스턴스 자신의 참조값을 가리킨다.
        : this는 생략할 수 있다.
          이 경우, 변수를 찾을 때 가까운 지역변수(매개변수도 지역변수임..)를 먼저 찾고 없으면 그 다음으로 멤버 변수를 찾는다.
          멤버 변수도 없으면 오류 발생...

    - 생성자
        : 객체를 생성하고 이후에 바로 초기값을 할당해야 하는 경우가 많다. 따라서 initMember()와 같은 메서드를 매번 만들어야 한다.
          그래서 대부분의 객체 지향 언어는 객체를 생성하자마자 즉시 필요한 기능을 좀 더 편리하게 수행할 수 있도록 생성자라는 기능을 제공한다.
          생성자를 사용하면 객체를 생성하는 시점에 즉시 필요한 기능을 수행할 수 있다.
*/
