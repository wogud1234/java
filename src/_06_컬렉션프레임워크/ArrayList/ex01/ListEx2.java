package _06_컬렉션프레임워크.ArrayList.ex01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListEx2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        List<Integer> numList = new ArrayList<>();
        System.out.println("n개의 정수를 입력하세요. (종료 0)");
        while(true) {
            int input = scan.nextInt();
            if(input == 0)
                break;
            numList.add(input);
        }

        for (int i = 0; i < numList.size(); i++) {
            System.out.print(numList.get(i));
            if(i < numList.size() -1)
                System.out.print(", ");
        }
    }
}
