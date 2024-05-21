package _01_OOP.step01_절차지향vs객체지향_캡슐화.step05_캡슐화와접근제어자.ex01;

import lombok.Getter;

public class MaxCounter {
    @Getter
    private int count;

    private final int max;

    public MaxCounter(int max) {
        this.max = max;
    }

    public void increment() {
        if(count >= 3) {
            System.out.println("최대값을 초과할 수 없습니다.");
            return;
        }
        count++;
    }
}
