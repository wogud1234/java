package _06_컬렉션프레임워크.ArrayList.step02_리스트구현;

public class ObjectList_BadMain {
    public static void main(String[] args) {

        ObjectList numberList = new ObjectList();

        // 숫자만 입력 하기를 기대....
        numberList.add(1);
        numberList.add(2);
        numberList.add("문자3");  // 문자 입력..

        // Object를 반환하므로 다운 캐스팅 필요
        Integer num1 = (Integer)numberList.get(0);
        Integer num2 = (Integer)numberList.get(1);

        // ClassCaseException 발생!!!, <- 문자를 Integer로 캐스팅..
        Integer num3 = (Integer)numberList.get(2);
    }
}

/*
    - 하나의 자료 구조에 숫자와 문자처럼 서로 관계없는 여러 데이터 타입을 섞어서 보관하는 일은 거의 없다.
      일반적으로 같은 데이터 타입을 보관하고 관리한다.

    - 제네릭을 도입하면 타입 안전성을 확보하면서 이런 문제를 한번에 해결할 수 있다.
      제네릭은 자료를 보관하는 자료 구조에 가장 어울린다.
*/
