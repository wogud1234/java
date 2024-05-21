package _03_유틸.java_lang.System클래스;

import java.util.Properties;
import java.util.Set;

public class ex04_시스템속성 {
    public static void main(String[] args) {

        String osName = System.getProperty("os.name");
        String userName = System.getProperty("user.name");
        String userHome = System.getProperty("user.home");
        System.out.println(osName);
        System.out.println(userName);
        System.out.println(userHome);

        System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.printf("%-40s: %s\n", "key", "value");
        System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        Properties props = System.getProperties();
        Set keys = props.keySet();

        for(Object objKey : keys) {
            String key = (String)objKey;
            String value = System.getProperty(key);
            System.out.printf("%-40s: %s\n", key, value);
        }
    }
}
