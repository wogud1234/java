package _01_OOP.ch03_클래스.익명클래스.ex02;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    public static void main(String[] args) {

        Button b1 = new Button("Start");
        b1.addActionListener(new EventHandler());
        // ActionListener를 구현한 클래스를 미리 만든 후 버튼의 메서드의 매개변수로 그 클래스의 객체를 생성하여 넘겨줌..

        // 익명 객체 사용
        // 미리 클래스를 만들지 않고, 곧 바로 ActionListener를 구현한 익명객체를 버튼의 메서드의 매개변수로 넘겨줌..
        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("ActionEvent occurred!!!");
            }
        });

    }
}
