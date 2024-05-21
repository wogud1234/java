package _01_OOP.ch03_클래스.다형성.추상클래스_바로작성;

abstract class Player {
    boolean pause;
    int currentPos;

    Player() {				// 추상클래스도 생성자가 있어야 한다.
        pause = false;
        currentPos = 0;
    }

    abstract void play(int pos);
    abstract void stop();

    void play() {
        play(currentPos);		// 추상메서드를 사용할 수 있다.
    }
    void pause() {
        if(pause) {
            pause = false;
            play(currentPos);	// 추상메서드를 사용할 수 있다.
        } else {
            pause = true;
            stop();				// 추상메서드를 사용할 수 있다.
        }
    }
}
