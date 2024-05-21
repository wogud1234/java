package _01_OOP.ch04_인터페이스.상속;

public class TVCR extends TV implements IVCR {
    VCR vcr = new VCR();

    @Override
    public void play() {
        vcr.play();
    }
    @Override
    public void stop() {
        vcr.stop();
    }
    @Override
    public void reset() {
        vcr.reset();
    }
    @Override
    public int getCounter() {
        return vcr.getCounter();
    }
    @Override
    public void setCounter(int c) {
        vcr.setCounter(c);
    }
}
/*
    - 인터페이스를 이용한 다중상속 (사용하는 경우는 거의 없음)
    - 두 개의 클래스로부터 상속을 받아야 할 상황이라면, 두 조상클래스 중에서 비중이 높은 쪽을 상속받고 다른 한 쪽은 클래스 내부에 멤버로 포함시키는
      방식으로 처리하거나 어느 한 쪽의 필요한 부분을 뽑아서 인터페이스로 만든 다음 구현하도록 한다.

    - 사실 인터페이스를 새로 작성하지 않고도 VCR클래스를 TVCR클래스에 포함시키는 것만으로도 충분하지만,
      인터페이스를 이용하면 다형적 특성을 이용할 수 있고, 느슨한 결합을 구축할 수도 있다.
*/
