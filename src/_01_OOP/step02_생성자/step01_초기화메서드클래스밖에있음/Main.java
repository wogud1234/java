package _01_OOP.step02_생성자.step01_초기화메서드클래스밖에있음;


public class Main {
    public static void main(String[] args) {

        MemberInit member1 = new MemberInit();
        initMember(member1, "user1", 19, 90);

        MemberInit member2 = new MemberInit();
        initMember(member2, "user2", 17, 80);

        MemberInit[] members = {member1, member2};

        for (MemberInit member : members) {
            System.out.println("이름: " + member.name + " 나이: " + member.age + " 성적: " + member.grade);
        }
    }

    private static void initMember(MemberInit member, String name, int age, int grade) {
        member.name = name;
        member.age = age;
        member.grade = grade;
    }
}
/*
    - 회원 객체를 생성하고 나면 name, age, grade 같은 변수에 초기값을 설정해야 하는데, 보통 객체를 생성하자마자 이런 초기값을 설정해야 할 것이다.
    - initMember()를 사용해서 반복을 제거했다.
      그런데 이 메서드는 대부분 MemberInit객체의 멤버를 사용한다.
      이런 경우 속성과 기능을 한 곳에 두는 것이 더 나은 방법이다.
      즉, MemberInit이 자기 자신의 데이터를 변경하는 기능(메서드)을 제공하는 것이 좋다.
*/
