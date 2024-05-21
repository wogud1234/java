package _01_OOP.ch04_인터페이스.상속;

class VCR {
    protected int counter;

    public void play() {
        System.out.println("테입 재생");
    }
    public void stop() {
        System.out.println("정지");
    }
    public void reset() {
        counter = 0;
    }
    public int getCounter() {
        return counter;
    }
    public void setCounter(int c) {
        counter = c;
    }
}
