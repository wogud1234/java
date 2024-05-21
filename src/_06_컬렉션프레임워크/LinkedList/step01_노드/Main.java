package _06_컬렉션프레임워크.LinkedList.step01_노드;

public class Main {
    public static void main(String[] args) {

        Node first = new Node("A");
        first.next = new Node("B");
        first.next.next = new Node("C");
        first.next.next.next = new Node("D");
        first.next.next.next.next = new Node("E");

        printAll(first);
        System.out.println(getLastNode(first).item);
        System.out.println(getNode(first, 4).item);

        add(first, "F");
        System.out.println(first);

        first = frontAdd(first, "X");
        System.out.println(first);

        add(first, 3, "X");
        System.out.println(first);

    }

    // 모든 노드 탐색
    private static void printAll(Node node) {
        Node navi = node;
        while(navi != null) {
            if(navi.next != null)
                System.out.print(navi.item + " -> ");
            else
                System.out.println(navi.item);
            navi = navi.next;
        }
    }

    // 마지막 노드 검색
    private static Node getLastNode(Node node) {
        Node navi = node;
        while(navi.next != null) {
            navi = navi.next;
        }
        return navi;
    }

    // 특정 인덱스의 노드 조회
    private static Node getNode(Node node, int index) {
        Node navi = node;
        for (int i = 0; i < index; i++) {
            navi = navi.next;
        }
        return navi;
    }

    // 마지막에 노드 추가
    private static void add(Node node, Object item) {
        Node navi = getLastNode(node);
        navi.next = new Node(item);
    }

    // 맨 앞에 노드 추가
    private static Node frontAdd(Node node, Object item) {
        Node newNode = new Node(item);
        newNode.next = node;
        return newNode;
    }

    // 중간에 노드 추가
    private static void add(Node node, int index, Object item) {
        Node newNode = new Node(item);
        Node navi = node;
        for (int i = 0; i < index-1; i++) {
            navi = navi.next;
        }
        newNode.next = navi.next;
        navi.next = newNode;
    }
}
