package _01_OOP.step02_생성자.step03_생성자출현;

public class Main {
    public static void main(String[] args) {

        MemberConstruct member1 = new MemberConstruct("user1", 19, 90);

        MemberConstruct member2 = new MemberConstruct("user2", 17, 80);


        MemberConstruct[] members = {member1, member2};

        for (MemberConstruct member : members) {
            System.out.println("이름: " + member.name + " 나이: " + member.age + " 성적: " + member.grade);
        }
    }
}
/*
    - new연산자로 MemberConstruct 인스턴스를 생성하고, 바로 그 뒤에 생성자를 호출한다.

    - 생성자가 없던 시절에는 생성 직후에 어떤 작업을 수행하기 위해 특정 메서드를 직접 한 번 더 호출해야 했다.
      생성자 덕분에 개겣를 생성하면서 동시에 생성 직후에 필요한 작업을 한번에 처리할 수 있게 되었다.

    - 생성자가 없던 시절에 객체 생성 후 initMember()를 실수로 호출하지 않으면 어떻게 될까?...
      이 메서드를 호출하지 않아도 프로그램은 작동한다. 하지만 회원의 이름, 나이, 성적 데이터가 없는 상태로 프로그램이 동작하게 된다.
      만약 이 값들을 필수로 반드시 입력해야 한다면, 시스템에 큰 문제가 발생할 수 있다.
      결국 아무 정보가 없는 유령 회원이 시스템 내부에 등장하게 된다.

    - 생성자의 진짜 장점은 객체를 생성할 때 직접 정의한 생성자가 있다면 직접 정의한 생성자를 반드시 호출해야 한다는 점이다.
      직접 정의한 생성자를 호출하지 않으면 컴파일 오류가 발생한다.
      컴파일 오류는 IDE에서 즉시 확인할 수 있는 좋은 오류이다.
      이 경우 개발자는 객체를 생성할 때, 직접 정의한 생성자를 필수로 호출해야 한다는 것을 바로 알 수 있다.
      생성자 덕분에 회원의 이름, 나이, 성적은 항상 필수로 입력하게 된다.
      따라서 아무 정보가 없는 유령 회원이 시스템 내부에 등장할 가능성을 원천 차단한다.
*/

