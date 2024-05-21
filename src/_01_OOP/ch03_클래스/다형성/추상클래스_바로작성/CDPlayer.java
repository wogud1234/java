package _01_OOP.ch03_클래스.다형성.추상클래스_바로작성;

// 조상클래스의 추상메서드를 CDPlayer클래스의 기능에 맞게 완성해주고, CDPlayer만의 새로운 기능들을 추가한다.
public class CDPlayer extends Player {

    int currentTrack;

    @Override
    void play(int currentPos) {
        System.out.println("추상메서드 구현");
    }
    @Override
    void stop() {
        System.out.println("추상메서드 구현");
    }
    void nextTract() {
        currentTrack++;
        //...
    }
    void preTrack() {
        if(currentTrack > 1) {
            currentTrack--;
            //....
        }
    }
}
/*
    - 사실 추상메서드를 사용하는 대신에 일반 메서드를 오버라이딩 하는 방식으로 해도 된다.
      그래도 굳이 추상메서드로 선언하는 이유는 자손 클래스에서 추상메서드를 반드시 구현하도록 강요하기 위해서이다.
      만일 추상메서드로 정의되어 있지 않고 오버라딩하는 형식으로 하게된다면, 상속받는 자손클래스에서는 이 메서드들이 온전히 구현된 것으로 인식하고,
      오버라이딩을 통해 자신의 클래스에 맞도록 구현하지 않고 그냥 부모것을 사용할 수도 있다.
      하지만 추상메서드로 정의해 놓으면 자손클래스를 작성할 때 이들이 추상메서드이므로 내용을 구현해주어야 한다는 사실을 인식하고 자신의 클래스에 알맞게 구현할 것이다.
*/
