package _01_OOP.ch02_초기화블럭;

class Document {
    static int noTitleCount = 0;
    String name;

    Document() {
        this("제목없음" + ++noTitleCount);
    }

    Document(String name){
        this.name = name;
        System.out.println("문서: " + this.name + "가 생성되었습니다.");
    }
}

public class ex05_생성자 {
    public static void main(String[] args) {

        Document d1 = new Document();
        Document d2 = new Document("자바.txt");
        Document d3 = new Document();
        Document d4 = new Document();
    }
}
