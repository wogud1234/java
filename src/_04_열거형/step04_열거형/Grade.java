package _04_열거형.step04_열거형;

public enum Grade {
    BASIC, GOLD, DIAMOND
}

/*
    - 두 코드는 같다.
        public class Grade extends Enum {

            public static final Grade BASIC = new Grade();
            public static final Grade GOLD = new Grade();
            public static final Grade DIAMOND = new Grade();

            private Grade() { }
        }

    - 열거형도 클래스이다. 열거형을 제공하기 위해 제약이 추가된 클래스라 생각하면 된다.
    - 열거형은 자동으로 java.lang.Enum을 상속받는다.
    - 외부에서 임의로 생성할 수 없다.
*/