package _06_컬렉션프레임워크.ArrayList.step01_배열에추가;

import java.util.Arrays;

public class 배열매개변수 {
    public static void main(String[] args) {

        int[] x = { 1, 2, 3 };
        System.out.println("x = " + Arrays.toString(x));
        int[] y = x;
        System.out.println("y = " + Arrays.toString(y));

        y = new int[] { 9, 9, 9};
        System.out.println("y = " + Arrays.toString(y));

        x = new int[] { 3, 3, 3 };
        System.out.println("x = " + Arrays.toString(x));

        System.out.println();

        int[] arr = {1, 2, 3};
        modifyArray(arr);
        System.out.println(Arrays.toString(arr)); // [1, 2, 3] 출력됨

    }

    public static void modifyArray(int[] array) {
        array[0] = 5;
        array = new int[]{7, 8, 9};
    }
}

/*
    - 자바에서는 메서드에 배열을 전달할 때, 배열이 아닌 배열을 가리키는 참조(reference)가 복사됩니다.
      이 참조는 메서드 내에서 원본 배열을 변경할 수 있게 해줍니다.
      그러나 이 복사된 참조를 변경하여 다른 배열을 가리키게 할 수는 없습니다.

    - 포인터를 사용하는 언어에서는 메모리 주소를 직접 조작하여 객체나 배열의 내용을 변경할 수 있습니다.
      그렇기 때문에 포인터를 사용하는 언어에서는 메서드 내에서 배열에 대한 포인터를 변경하여 원본 배열 자체를 변경할 수 있습니다.
      그러나 자바는 포인터 연산이나 명시적인 메모리 주소 조작이 불가능한 언어입니다.
      따라서 자바에서는 메서드에 배열을 전달할 때 해당 배열의 복사본이 아닌 참조가 복사되며,
      이 참조를 통해 원본 배열의 내용을 변경할 수 있습니다.
      그러나 메서드 내에서 배열에 대한 참조를 변경하더라도 이는 해당 메서드 내에서만 영향을 미치며, 호출자에게는 영향을 주지 않습니다.
      따라서 자바에서는 배열의 내용을 변경할 때는 배열에 직접 접근하여 내용을 변경하거나, 새로운 배열로 요소를 복사하여 처리해야 합니다.
*/



/*
    - private static void addToEnd(int[] arr, int data) {
        int idx = 0;
        if((idx=isCheckFull(arr)) >= arr.length)
            arr = arrSizeUp(arr);   // 이거는 원본에 적용 안 됨.

        arr[idx] = data;            // 이거는 원본에 적용됨..
      }
        : addToEnd(arr, 1);을 호출하더라도 원본 arr의 내용은 변경되지 않습니다.
          그 이유는 자바에서는 메서드에 전달된 배열은 참조로 전달되기 때문입니다.
          이것은 배열의 내용을 변경할 수 있지만, 배열 참조 자체를 변경할 수 없음을 의미합니다.
*/