package _02_예외.ch02_예외떠넘기기;

import java.io.File;

// 예외가 발생한 메서드에서 자체적으로 처리
public class ex04_throw후자체처리 {

    public static void main(String[] args) {

        File f = createFile(args[0]);	// main()에서는 예외가 발생한 사실을 알지 못한다.
        System.out.println(f.getName() + " 파일이 성공적으로 생성되었습니다.");
    }

    static File createFile(String fileName) {
        try {
            if(fileName==null || fileName.equals(""))
                throw new Exception("파일이름이 유효하지 않습니다.");
        } catch(Exception e) {
            fileName = "제목없음.txt";
        } finally {
            File f = new File(fileName);
            createNewFile(f);
            return f;
        }
    }

    static void createNewFile(File f) {
        try {
            f.createNewFile();	// File클래스의 createNewFile()은 예외가 선언된 메서드이므로 에외처리 해줘야한다.
        } catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
