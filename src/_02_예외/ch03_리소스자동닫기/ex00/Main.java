package _02_예외.ch03_리소스자동닫기.ex00;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;

/*
 	- 주로 입출력에 사용되는 클래스 중에서는 사용한 후에 꼭 닫아 줘야 하는 것들이 있다.
 	  그러한 경우 보통 finally블럭에 close()를 넣어주는데 이 때 close()에서도 예외가 발생할 수 있다.
 	  그러면 finally블럭 안에 또 try-catch블럭을 넣어줘야한다.
 	  더 나쁜 것은 try블럭과 finally블럭에서 모두 예외가 발생하면, try블럭의 예외는 무시된다는 것이다.
 	  이러한 점을 개선하기 위해서 try-with-resources문이 추가된 것이다.
*/
public class Main {
    public static void main(String[] args) {

        int score = 0;
        int sum = 0;

        try (FileInputStream fis = new FileInputStream("score.dat");    // 괄호안에 두 문장 이상을 넣을 경우 ';'로 구분한다.
             DataInputStream dis = new DataInputStream(fis)) {

            while(true) {
                score = dis.readInt();
                System.out.println(score);
                sum += score;
            }
        } catch(EOFException e) {
            System.out.println("점수의 총합은 " + sum + "입니다.");
        } catch(IOException e) {
            e.printStackTrace();
        }
    }
}
/*
 	- try-with-resources문의 괄호안에 객체를 생성하는 문장을 넣으면, 이 객체는 따로 close()를 호출하지 않아도 try블럭을 벗어나는 순간
 	  자동적으로 close()가 호출된다. 그 다음에 catch블럭 또는 finally블럭이 수행된다.

 	- try-with-resources문에 의해 자동으로 객체의 close()가 호출될 수 있으려면, 클래스가 AutoCloseable이라는 인터페이스를 구현한 것이어야만 한다.

 			public interface AutoCloseable {
 				void close() throws Exception;
			}
*/
