package _04_열거형.ex01;

public class AuthGradeInfo {
    public static void main(String[] args) {

        AuthGrade[] values = AuthGrade.values();
        for (AuthGrade value : values) {
            System.out.println("grade = " + value.name() + ", level = " + value.getLevel()
            + ", 설명 = " + value.getDescription());
        }
    }
}
