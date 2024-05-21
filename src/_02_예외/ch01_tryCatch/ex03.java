package _02_예외.ch01_tryCatch;

public class ex03 {
    public static void main(String[] args) {

        String[] arr = { "100", "1oo", null, "200" };

        for(int i=0 ; i<=arr.length ; i++) {
            try {
                int value = Integer.parseInt(arr[i]);
                System.out.println("arr[" + i + "]: " + value);
            } catch(ArrayIndexOutOfBoundsException e) {
                System.out.println("배열 인덱스가 초과됨: " + e.getMessage());
            } catch(NumberFormatException | NullPointerException e) {
                System.out.println("숫자로 변환할 수 없거나 null값이 들어옴...: " + e.getMessage());
            } catch(Exception e) {
                System.out.println("실행에 문제가 있습니다.");
            }
        }
    }
}
