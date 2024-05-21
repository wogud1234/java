package _06_컬렉션프레임워크.ArrayList.step03_리스트추상화_인터페이스;

public class Main {
    public static void main(String[] args) {

        BatchProcessor processor = new BatchProcessor(new ArrayList<Integer>());    // 의존성 주입
        processor.logic(50_000);

        processor = new BatchProcessor(new LinkedList<Integer>());                  // 의존성 주입
        processor.logic(50_000);
    }
}

/*
    - ArrayList     -> O(n^2)
    - LinkedList    -> O(n)
*/
