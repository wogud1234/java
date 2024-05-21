package _05_제네릭.level1.step04_활용예1;

public class Box <T> {

    private T value;

    public T get() {
        return value;
    }

    public void set(T value) {
        this.value = value;
    }
}
