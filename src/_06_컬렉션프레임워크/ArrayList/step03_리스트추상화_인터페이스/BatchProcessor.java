package _06_컬렉션프레임워크.ArrayList.step03_리스트추상화_인터페이스;

public class BatchProcessor {

    private final List<Integer> list;

    public BatchProcessor(List<Integer> list) {     // 의존성 주입..
        this.list = list;
    }

    public void logic(int size) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {        // O(n)
            list.add(0, i);               // O(n)      ==> O(n^2) : ArrayList로 했을 때 성능...
        }
        long endTime = System.currentTimeMillis();
        System.out.println("크기: " + size + ", 계산 시간: " + (endTime - startTime) + "ms");
    }
}

/*
    - 사용자는 BatchProcessor를 생성하는 시점에 생성자를 통해 원하는 리스트 전략(알고리즘)을 선택해서 전달하면 된다.
      이렇게 하면 List를 사용하는 클라이언트 코드인 BatchProcessor를 전혀 변경하지 않고, 원하는 리스트 전략을
      런타임에 지정할 수 있다.

    - 어떤 List list의 구현체를 선택할 지는 실행 시점에 생성자를 통해서 결정된다.
      (생성자를 통해서 List의 구현체가 전달된다.)
      이것은 BatchProcessor의 외부에서 의존관계가 결정되어서 BatchProcessor 인스턴스에 들어오는 것 같다.
      마치 의존 관계가 외부에서 주입되는 것 같다고 해서 이것을 의존관계 주입이라고 한다.
      참고로 생성자를 통해서 의존관계를 주입했기 때문에 생성자 의존관계 주입이라 한다.

    - 의존성 주입 (DI - Dependency Injection)

    - 전략 패턴(Strategy Pattern)
        : 디자인 패턴 중에 가장 중요한 패턴을 하나 뽑으라고 하면 전략 패턴을 뽑을 수 있다.
          전략 패턴은 알고리즘을 클라이언트 코드의 변경 없이 쉽게 교체할 수 있다.
          방금 설명한 코드가 바로 전략 패턴을 사용한 코드이다.
          MyList 인터페이스가 바로 전략을 정의하는 인터페이스가 되고, 각각의 구현체인 MyArrayList, MyLinkedList 가 전략의 구체적인 구현이 된다.
          그리고 전략을 클라이언트 코드( BatchProcessor )의 변경 없이 손쉽게 교체할 수 있다.

    - 의존관계는 크게 컴파일 타임 의존관계와 런타임 의존관계로 나눌 수 있다.
      컴파일 타임(compile time): 코드 컴파일 시점을 뜻한다.
      런타임(runtime): 프로그램 실행 시점을 뜻한다.

    - 클라이언트 클래스는 컴파일 타임에 추상적인 것에 의존하고, 런타임에 의존 관계 주입을 통해 구현체를 주입받아
      사용함으로써, 이점을 얻을 수 있다.
*/