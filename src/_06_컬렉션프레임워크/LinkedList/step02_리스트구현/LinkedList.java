package _06_컬렉션프레임워크.LinkedList.step02_리스트구현;

public class LinkedList {

    private Node first;
    private int size = 0;

    public void add(Object e) {
        Node newNode = new Node(e);
        if(first == null) {
            first = newNode;
        } else {
            Node lastNode = getLastNode();
            lastNode.next = newNode;
        }
        size++;
    }

    private Node getLastNode() {
        Node navi = first;
        while(navi.next != null) {
            navi = navi.next;
        }
        return navi;
    }

    public Object set(int index, Object element) {
        Node navi = getNode(index);
        Object oldValue = navi.item;
        navi.item = element;
        return oldValue;
    }

    public Object get(int index) {
        Node node = getNode(index);
        return node.item;
    }
    private Node getNode(int index) {
        Node navi = first;
        for (int i = 0; i < index; i++) {
            navi = navi.next;
        }
        return navi;
    }

    public int indexOf(Object o) {
        int index = 0;
        for(Node x = first ; x!= null ; x = x.next) {
            if(o.equals(x.item))
                return index;
            index++;
        }
        return -1;
    }

    public int size() {
        return size;
    }

    public void add(int index, Object o) {
        Node newNode = new Node(o);
        if(index == 0) {
            newNode.next = first;
            first = newNode;
        } else {
            Node prev = getNode(index - 1);
            newNode.next = prev.next;
            prev.next = newNode;
        }
        size++;
    }

    public void lastRemove() {
        Node prev = first;
        Node navi = first;
        while(navi.next != null) {
            prev = navi;
            navi = navi.next;
        }
        prev.next = null;
        size--;
    }

    public Object remove(int index) {
        Node removeNode = getNode(index);
        Object removedItem = removeNode.item;
        if(index == 0) {
            first = first.next;
        } else {
            Node prev = getNode(index - 1);
            prev.next = removeNode.next;
        }
        removeNode.item = null;
        removeNode.next = null;
        size--;
        return removedItem;
    }

    @Override
    public String toString() {
        return first + " , size: " + size;
    }
}
