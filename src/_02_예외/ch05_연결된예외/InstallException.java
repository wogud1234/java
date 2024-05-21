package _02_예외.ch05_연결된예외;

/*
 	- 연결된 예외
 		: 예외 A가 예외 B를 발생시켰다면, A를 B의 '원인 예외'라고 한다.
*/
public class InstallException extends Exception {
    InstallException(String msg) {
        super(msg);
    }
}
class SpaceException extends Exception {
	SpaceException(String msg) {
		super(msg);
	}
}
class MemoryException extends Exception {
	MemoryException(String msg) {
		super(msg);
	}
}
