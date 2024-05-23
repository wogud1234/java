package _03_유틸.java_lang.Object클래스.clone;

import java.util.Arrays;

public class Main_Cloneable구현한클래스들 {
    public static void main(String[] args) {

        Point origin = new Point(3, 5);
        Point copy = origin.clone();

        System.out.println("origin = " + origin);
        System.out.println("copy = " + copy);

        System.out.println("\n------------------------\n");

        int[] originArr = { 1, 2, 3, 4, 5 };
        int[] copyArr = originArr.clone();
        copyArr[0] = 999;

        System.out.println("Arrays.toString(originArr) = " + Arrays.toString(originArr));       // [1, 2, 3, 4, 5]
        System.out.println("Arrays.toString(copyArr) = " + Arrays.toString(copyArr));           // [999, 2, 3, 4, 5]

        System.out.println("\n------------------------\n");

        int[] copyArr2 = new int[originArr.length];
        System.arraycopy(originArr, 0, copyArr2, 0, originArr.length);
        System.out.println("Arrays.toString() = " + Arrays.toString(copyArr2));
    }
}

/*
    - 배열도 객체이기 때문에 Object클래스를 상속받으며, 동시에 Cloneable인터페이스와  Serializable인터페이스가 구현되어 있다.
	- 배열 뿐만 아니라 java.util패키지의 Vector, ArrayList, LinkedList, HashSet, TreeSet, HashMap, TreeMap, Calendar, Date 등의 클래스도
	  이와 같은 복제가 가능하다.
*/