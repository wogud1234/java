package _03_유틸.롬복.step02_레코드;

public record Person(String id, String name, int age) {
}

/*
    - 레코드 컴파일하면 컴파일러에 의해 step01_DTO.Person과 같은 코드가 생성된다.
*/