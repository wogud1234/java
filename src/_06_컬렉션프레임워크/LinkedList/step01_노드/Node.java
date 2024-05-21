package _06_컬렉션프레임워크.LinkedList.step01_노드;

public class Node {

    Object item;
    Node next;

    public Node(Object item) {
        this.item = item;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        Node navi = this;
        sb.append("[");
        while(navi != null) {
            sb.append(navi.item);
            if(navi.next != null)
                sb.append(" -> ");
            navi = navi.next;
        }
        sb.append("]");

        return sb.toString();
    }
}
