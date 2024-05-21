package _02_예외.ch03_리소스자동닫기.ex02_억제된예외;

public class Main {
    public static void main(String[] args) throws Exception {

        // (1) close()에서만 예외를 발생시킴.
        try (CloseableResource cr = new CloseableResource()) {
            cr.exceptionWork(false);
        } catch(WorkException e) {
            e.printStackTrace();
        } catch(CloseException e) {
            e.printStackTrace();
        }
        System.out.println("\n");

        // (2) close()와 exceptionWork() 모두에서 예외를 발생시킴.
        //		: 먼저 exceptionWork()에서 발생한 예외에 대한 내용이 출력되고, close()에서 발생한 예외는 '억제된(suppressed)'이라는 의미의 머리말과 함께 출력된다.
        //		: 두 예외가 동시에 발생할 수는 없기 때문에, 실제 발생한 예외를 WorkException으로 하고, CloseException은 억제된 예외로 둔다.
        //		: 억제된 예외에 대한 정보는 실제로 발생한 예외인 WorkException에 저장된다.
        //		: 만일 기존의 try-catch문을 사용했다면, 먼저 발생한 WorkException은 무시되고, 마지막으로 발생한 CloseException에 대한 내용만 출력되었을 것이다.
        try (CloseableResource cr = new CloseableResource()) {
            cr.exceptionWork(true);
        } catch(WorkException e) {
            e.printStackTrace();
        } catch(CloseException e) {
            e.printStackTrace();
        }
		/*
			- Throwable에는 억제된 예외와 관련된 메서드가 정의되어있다.
				void addSuppressed(Throwable exception)	- 억제된 예외를 추가
				Throwable[] getSuppressed()				- 억제된 예외(배열)를 반환
		*/
    }
}
