package _02_예외.ch04_사용자정의예외.ex02;

public class Main {
    public static void main(String[] args) {

        try {
            startInstall();
            copyFiles();
        } catch(SpaceException e) {
            System.out.println("에러 메시지: " + e.getMessage());
            e.printStackTrace();
            System.out.println("공간을 확보한 후 다시 설치하시기 바랍니다.");
        } catch(MemoryException e) {
            System.out.println("에러 메시지: " + e.getMessage());
            e.printStackTrace();
            System.gc();	// Garbage Collection을 수행하여 메모리를 늘려준다.
            System.out.println("다시 설치를 시도하세요.");
        } finally {
            deleteTempFiles();
        }
    }

    static void startInstall() throws SpaceException, MemoryException {
        if(!enoughSpace())
            throw new SpaceException("설치할 공간이 부족합니다.");
        if(!enoughMemory())
            throw new MemoryException("메모리가 부족합니다.");
    }
    static void copyFiles() { }
    static void deleteTempFiles() { }

    static boolean enoughSpace() {
        return false;
    }
    static boolean enoughMemory() {
        return false;
    }
}
