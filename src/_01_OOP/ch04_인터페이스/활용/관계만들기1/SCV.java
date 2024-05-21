package _01_OOP.ch04_인터페이스.활용.관계만들기1;

public class SCV extends GroundUnit implements Repairable {
    SCV() {
        super(60);
        hitPoint = MAX_HP;
    }
    void repair(Repairable r) {
        if(r instanceof Unit) {
            Unit u = (Unit)r;
            while(u.hitPoint != u.MAX_HP) {
                u.hitPoint++;
            }
            System.out.println(u.toString() + "의 수리가 끝났습니다.");
        }
    }
    /*
         - repair메서드의 매개변수 r은 Repairable타입이기 때문에 인터페이스 Repairable에 정의된 멤버만 사용할 수 있다.
           그러나 Repairable에는 정의된 멤버가 없으므로 이 타입의 참조변수로는 할 수 있는 일은 아무것도 없다.
           그래서 instanceof연산자로 타입을 체크한 뒤 캐스팅하여 Unit클래스에 정의된 hitPoint와 MAX_HP를 사용할 수 있도록 하였다.
    */
    public String toString() {
        return "SCV";
    }
}
