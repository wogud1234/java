package _01_OOP.step09_내부클래스.지역클래스.step03_지역변수캡쳐;

import _01_OOP.step09_내부클래스.지역클래스.step02_인터페이스구현.Printer;

import java.lang.reflect.Field;

public class LocalOuter {

    private int outInstanceVar = 3;

    public Printer process(int paramVar) {

        int localVar = 1; //지역 변수는 스택 프레임이 종료되는 순간 함께 제거된다.

        class LocalPrinter implements Printer {

            int value = 0;

            @Override
            public void print() {
                System.out.println("value=" + value);                   // 인스턴스는 지역 변수보다 더 오래 살아남는다.
                System.out.println("localVar=" + localVar);             // 변수 캡쳐 대상
                System.out.println("paramVar=" + paramVar);             // 변수 캡쳐 대상
                System.out.println("outInstanceVar=" + outInstanceVar);
            }
        }

        Printer printer = new LocalPrinter();                     // printer.print()를 여기서 실행하지 않고 Printer 인스턴스만 반환한다.

        // 만약 localVar의 값을 변경한다면? 다시 캡처해야 하나??
        // localVar = 10; // 컴파일 오류
        // paramVar = 20; // 컴파일 오류

        return printer;
    }

    public static void main(String[] args) {

        LocalOuter localOuter = new LocalOuter();
        Printer printer = localOuter.process(2);        // printer.print()를 나중에 실행한다. process()의 스택 프레임이 사라진 이후에 실행
        printer.print();

        System.out.println("\n--------------------------\n");

        System.out.println("필드 확인");
        Field[] fields = printer.getClass().getDeclaredFields();
        for (Field field : fields)
            System.out.println("field = " + field);
    }
}

/*
    - 지역 변수인 paramVar, localVar 는 process() 메서드가 실행되는 동안에만 생존할 수 있다.
      process() 메서드가 종료되면 process() 의 스택 프레임이 제거되면서 두 지역 변수도 함께 제거된다.
      여기서 문제는 process() 메서드가 종료되어도 LocalPrinter 인스턴스는 계속 생존할 수 있다는 점이다.

    - 어떻게 제거된 지역 변수들에 접근할 수 있는 것일까?
        : 자바는 이런 문제를 해결하기 위해 지역 클래스의 인스턴스를 생성하는 시점에 필요한 지역 변수를 복사해서 생성한 인스턴스에 함께 넣어둔다.
          이런 과정을 변수 캡처(Capture)라 한다.
          물론 모든 지역 변수를 캡처하는 것이 아니라 접근이 필요한 지역 변수만 캡처한다.

        : LocalPrinter 인스턴스에서 print() 메서드를 통해 paramVar, localVar 에 접근하면 사실은 스택영역에 있는 지역 변수에 접근하는 것이 아니다.
          대신에 인스턴스에 있는 캡처한 변수에 접근한다.
          캡처한 paramVar , localVar 의 생명주기는 LocalPrinter 인스턴스의 생명주기와 같다.
          따라서 LocalPrinter 인스턴스는 지역 변수의 생명주기와 무관하게 언제든지 paramVar , localVar 캡처 변수에 접근할 수 있다.
          이렇게 해서 지역 변수와 지역 클래스를 통해 생성한 인스턴스의 생명주기가 다른 문제를 해결한다.

    - 지역 클래스가 접근하는 지역 변수는 절대로 중간에 값이 변하면 안된다.
      따라서 final 로 선언하거나 또는 사실상 final 이어야 한다. 이것은 자바 문법이고 규칙이다.

    - 캡처 변수의 값을 변경하지 못하는 이유
        : 지역 변수의 값을 변경하면 인스턴스에 캡처한 변수의 값도 변경해야 한다.
          반대로 인스턴스에 있는 캡처 변수의 값을 변경하면 해당 지역 변수의 값도 다시 변경해야 한다.
          개발자 입장에서 보면 예상하지 못한 곳에서 값이 변경될 수 있다. 이는 디버깅을 어렵게 한다.
          지역 변수의 값과 인스턴스에 있는 캡처 변수의 값을 서로 동기화 해야 하는데,
          멀티쓰레드 상황에서 이런 동기화는 매우 어렵고, 성능에 나쁜 영향을 줄 수 있다.

        : 이 모든 문제는 캡처한 지역 변수의 값이 변하기 때문에 발생한다.
          자바는 캡처한 지역 변수의 값을 변하지 못하게 막아서 이런 복잡한 문제들을 근본적으로 차단한다.
*/