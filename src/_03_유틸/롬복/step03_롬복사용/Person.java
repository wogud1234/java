package _03_유틸.롬복.step03_롬복사용;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Person {
    private String id;
    private String name;
    private int age;
}

/*
    - 롬복
        : DTO클래스를 작성할 때 Object의 메소드를 자동 생성하기 때문에 작성할 코드의 양을 줄여준다.
        : 레크도와의 차이점은 필드가 final이 아니며, 값을 읽는 Getter/Setter의 이름이 getXxx, setXxx로 생성된다.

    - 사용법
        : https://projectlombok.org/download에서 lombok.jar 다운로드
        : File -> Project Structure.. -> Modules -> Dependencies
        : File -> Settings -> Build, Execution, Deployment -> Compiler -> Annotation Processors
            -> Enable annotation processing에 체크

    - 어노테이션
        : @NoArgsConstructor
          @AllArgsConstructor
          @RequiredArgsArgsConstructor
          @Getter
          @Setter
          @EqalsAndHashCode
          @ToString

          @Data
            : 위 어노테이션들이 모두 합쳐진 것과 동일한 효과
*/
