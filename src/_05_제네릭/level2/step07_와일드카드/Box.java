package _05_제네릭.level2.step07_와일드카드;

public class Box <T> {

    private T value;

    public void set(T value) {
        this.value = value;
    }

    public T get() {
        return value;
    }
}
