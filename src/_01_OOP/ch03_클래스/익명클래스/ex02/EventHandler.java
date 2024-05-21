package _01_OOP.ch03_클래스.익명클래스.ex02;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EventHandler implements ActionListener {
    public void actionPerformed(ActionEvent e) {

        System.out.println("ActionEvent occurred!!!");
    }
}
