package _00_공통.ch04_배열.인덱스활용;

public class binary변환프로그램 {
    public static void main(String[] args) {

        char[] hex = { 'C', 'A', 'F', 'E' };
        String[] binary = {
                "0000", "0001", "0010", "0011",
                "0100", "0101", "0110", "0111",
                "1000", "1001", "1010", "1011",
                "1100", "1101", "1110", "1111"
        };
        String result = "";

        for(int i=0, idx=0 ; i<hex.length ; i++) {
            if(hex[i]>='0' && hex[i]<='9')
                result += binary[hex[i] - '0'];
            else
                result += binary[hex[i] - 'A' + 10];
        }

        System.out.println(result);
    }
}
