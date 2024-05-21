package _01_OOP.ch03_클래스.익명클래스.ex01;

/*
 	- 익명 클래스
 		: 생성자 없음
 		: 조상클래스의 이름이나 구현하고자 하는 인터페이스의 이름을 사용해서 정의한다.
 		: 오로지 단 하나의 클래스를 상속받거나 단 하나의 인터페이스만을 구현할 수 있다.
 		: 이름이 없기 때문에 '외부 클래스명$숫자.class'의 형식으로 클래스 파일명이 결정된다.
*/
public class Main {

    Object iv = new Object() {
        void method() {

        }
    };
    static Object cv = new Object() {
        void method() {

        }
    };
    void method() {
        Object lv = new Object() {
            void method() {

            }
        };
    }
}
