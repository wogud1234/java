package _01_OOP.ch03_클래스.관계.ex03_다중상속대신;

/*
 	- 자바는 다중상속을 허용하지 않으므로 TV클래스를 조상으로 하고, VCR클래스는 TVCR클래스에 포함시켰다.
 	  그리고 TVCR클래스에 VCR클래스의 메서드와 일치하는 선언부르 가진 메서드를 선언하고 내용은 VCR클래스의 것을 호출해서 사용하도록 했다.
 	  외부적으로는 TVCR클래스의 인스턴스를 사용하는 것처럼 보이지만 내부적으로는 VCR클래스의 인스턴스를 생성해서 사용하는 것이다.
 	  이렇게 함으로써 VCR클래스의 메서드의 내용이 변경되더라도 TVCR클래스의 메서드들 역시 변경된 내용이 적용되는 결과를 얻을 수 있을 것이다.
*/

public class Tv {
    boolean power;
    int channel;
    void power() { power = !power; }
    void channelUp() { channel++; }
    void channelDonw() { channel--; }
}

class VCR {
    boolean power;
    int counter = 0;
    void power() { power = !power; }
    void play() { }
    void stop() { }
    void rew() { }
    void ff() { }
}

class TvCR extends Tv {
    VCR vcr = new VCR();

    void play() {
        vcr.play();
    }
    void stop() {
        vcr.stop();
    }
    void rew() {
        vcr.rew();
    }
    void ff() {
        vcr.ff();
    }
}