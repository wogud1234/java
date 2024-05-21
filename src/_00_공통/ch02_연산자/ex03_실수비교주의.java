package _00_공통.ch02_연산자;

public class ex03_실수비교주의 {
    public static void main(String[] args) {

        float f = 0.1f;
        double d = 0.1;
        double d2 = (double)f;

        System.out.printf("10.0 == 10.0f        %b\n", 10.0 == 10.0f);	// true
        System.out.printf("0.1 == 0.1f  	     %b\n", 0.1 == 0.1f);		// false
        System.out.printf("(float)0.1 == 0.1f   %b\n", (float)0.1 == 0.1f);		// false
		/*
			- 10.0f는 오차없이 저장할 수 있는 값이라서 double형으로 형변환해도 그대로 10.0이 되지만,
			  0.1f는 저장할 때 2진수로 변환하는 과정에서 오차가 발생한다.
			  double타입의 상수도 0.1이 저장되는 과정에서 오차가 발생하지만, float타입의 리터럴인 0.1f보다 적은 오차로 저장된다.
			  		f = 0.10000000149011612
			  		d = 0.10000000000000001

			- float타입의 값을 double타입으로 형변환하면, 부호와 지수는 달라지지 않고 그저 가수의 빈자리를 0으로 채울 뿐이므로 0.1f를 double타입으로 형변환해도
			  그 값은 전혀 달라지지 않는다.
			  즉, float 타입의 값을 정밀도가 더 높은 double타입으로 형변환했다고 해서 오차가 적어지는 것이 아니다.
			   		d2 = 0.10000000149011612

			=> float과 double탑입의 값을 비교하려면 double타입의 값을 float타입으로 형변환한 다음에 비교해야 한다.
			   또는 어느 정도의 오차는 무시하고 두 타입의 값을 앞에서 몇 자리만 잘라서 비교할 수도 있다.
		*/

        float a = 0.1f;
        float b = a + 0.9f;
        float c = b - 0.9f;
        System.out.println(a);      // 0.1
        System.out.println(b);      // 1.0
        System.out.println(c);      // 0.100000024
    }
}
