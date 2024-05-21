package _03_유틸.java_lang.String클래스.StringBuilder;

class ValueAdder {

    private int value;

    public ValueAdder add(int addValue) {
        value += addValue;
        return this;
    }

    public int getValue() {
        return value;
    }
}

public class 메서드체이닝 {
    public static void main(String[] args) {

        {
            ValueAdder adder = new ValueAdder();
            adder.add(1);
            adder.add(2);
            adder.add(3);
            int result = adder.getValue();
            System.out.println("result = " + result);
        }
        System.out.println();
        
        {
            ValueAdder adder = new ValueAdder();
            ValueAdder adder1 = adder.add(1);
            ValueAdder adder2 = adder.add(2);
            ValueAdder adder3 = adder.add(3);
            int result = adder3.getValue();
            System.out.println("result = " + result);
        }
        System.out.println();

        {
            ValueAdder adder = new ValueAdder();
            int result = adder.add(1).add(2).add(3).getValue();
            System.out.println("result = " + result);
        }
    }
}
