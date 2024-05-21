package _01_OOP.step02_생성자.step02_초기화메서드클래스로이동;

public class Main {
    public static void main(String[] args) {

        MemberInit member1 = new MemberInit();
        member1.initMember("user1", 19, 90);

        MemberInit member2 = new MemberInit();
        member2.initMember("user2", 17, 80);

        MemberInit[] members = {member1, member2};

        for (MemberInit member : members) {
            System.out.println("이름: " + member.name + " 나이: " + member.age + " 성적: " + member.grade);
        }
    }
}

