package _01_OOP.ch04_인터페이스.상속;

public class TV {

    protected boolean power;
    protected int channel;
    protected int volume;

    public void power() { power = !power; }
    public void channelUp() { channel++; }
    public void channelDown() { channel--; }
    public void volumeUp() { volume++; }
    public void volumeDown() { volume--; }
}
