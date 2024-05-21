package _02_예외.ch05_연결된예외;

public class Main {
    public static void main(String[] args) {

        try {
            install();
        } catch(InstallException e) {
            e.printStackTrace();
        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    static boolean enoughMemory() {
        return false;
    }
    static boolean enoughSpace() {
        return true;
    }
    static void copyFiles() { System.out.println("파일 복사..."); }
    static void deleteTempFiles() { System.out.println("파일 삭제..."); }

    static void startInstall() throws SpaceException, MemoryException {
        if(!enoughSpace()) {
            throw new SpaceException("설치할 공간이 부족합니다.");
        }
        if(!enoughMemory()) {
            throw new MemoryException("메모리가 부족합니다.");
//			throw new RuntimeException(new MemoryException("메모리가 부족합니다."));	 // checked -> uncheked : startInstall()의 선언부에 MemoryException 안 써도 됨.
        }
    }
    static void install() throws InstallException {
        try {
            startInstall();
            copyFiles();
        } catch (SpaceException se) {
            InstallException ie = new InstallException("설치 중 예외발생");
            ie.initCause(se);	// InstallException의 원인 예외를 SpaceException으로 지정
            throw ie;
        } catch (MemoryException me) {
            InstallException ie = new InstallException("설치 중 예외발생");
            ie.initCause(me);
            throw ie;
        } finally {
            deleteTempFiles();
        }
    }
}
/*
 	- initCause()는 Exception클래스의 조상인 Throwable클래스에 정의되어 있기 때문에 모든 예외에서 사용가능하다.

 			Throwable initCause(Throwable cause)		- 지정한 예외를 원인 예외로 등록
 			Throwable getCause()						- 원인 예외를 반환

 			public class Throwable implements Serializable {
 				...
 				private Throwable cause = this;		// 객체 자신을 원인 예외로 등록
 				...
			}
*/

/*
 	- 발생한 예외를 그냥 처리하면 될 텐데, 원인 예외로 등록해서 다시 예외를 발생시키는 이유

 		1) 여러가지 에외를 하나의 큰 분류의 예외로 묶어서 다루기 위해...
 		2) checked에외를 unchecked예외로 바꿀 수 있도록 하기 위해...
*/
