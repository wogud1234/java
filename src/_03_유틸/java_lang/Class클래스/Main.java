package _03_유틸.java_lang.Class클래스;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {

        Class clazz = String.class;                                         // 1. 클래스에서 조회
        Class clazz2 = new String().getClass();                             // 2. 인스턴스에서 조회
        Class clazz3 = Class.forName("java.lang.String");        // 3. 문자열로 조회

        Field[] fields = clazz.getDeclaredFields();
        for (Field field : fields) {
            System.out.println("Field: " + field.getType() + " " + field.getName());
        }
        System.out.println();

        Method[] methods = clazz.getDeclaredMethods();
        for (Method method : methods) {
            System.out.println("method: " + method);
        }
        System.out.println();

        System.out.println("Superclass: " + clazz.getSuperclass().getName());
        System.out.println();

        Class[] interfaces = clazz.getInterfaces();
        for (Class anInterface : interfaces) {
            System.out.println("anInterface.getName() = " + anInterface.getName());
        }

        System.out.println();

        String str = (String)clazz.getDeclaredConstructor().newInstance();
        // 생성자 선택하고 그거로 인스턴스 생성...
    }
}

/*
    - Class 클래스의 주요 기능
        1) 타입 정보 얻기
        2) 리플렉션
            : 클래스에 정의된 메서드, 필드, 생성자 등을 조회하고, 이들을 통해 객체 인스턴스를 생성하거나 메서드를 호출하는 등의 작업을 할 수 있다.
        3) 동적 로딩과 생성
            : Class.forName()을 사용하여 클래스를 동적으로 로드하고, newInstance()를 통해 새로운 인스턴스를 생성할 수 있다.
        4) 애노테이션 터리
            : 클래스에 적용된 애노테이션을 조회하고 처리하는 기능을 제공.
*/