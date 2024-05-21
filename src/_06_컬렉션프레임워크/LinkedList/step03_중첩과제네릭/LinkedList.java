package _06_컬렉션프레임워크.LinkedList.step03_중첩과제네릭;

public class LinkedList<E> {

    private Node<E> first;
    private int size = 0;

    public void add(E e) {
        Node<E> newNode = new Node<>(e);
        if(first == null) {
            first = newNode;
        } else {
            Node<E> lastNode = getLastNode();
            lastNode.next = newNode;
        }
        size++;
    }

    private Node<E> getLastNode() {
        Node<E> navi = first;
        while(navi.next != null) {
            navi = navi.next;
        }
        return navi;
    }

    public Object set(int index, E element) {
        Node<E> navi = getNode(index);
        E oldValue = navi.item;
        navi.item = element;
        return oldValue;
    }

    public E get(int index) {
        Node<E> node = getNode(index);
        return node.item;
    }
    private Node<E> getNode(int index) {
        Node<E> navi = first;
        for (int i = 0; i < index; i++) {
            navi = navi.next;
        }
        return navi;
    }

    public int indexOf(E o) {
        int index = 0;
        for(Node<E> x = first ; x!= null ; x = x.next) {
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

    public E remove(int index) {
        Node<E> removeNode = getNode(index);
        E removedItem = removeNode.item;
        if(index == 0) {
            first = first.next;
        } else {
            Node<E> prev = getNode(index - 1);
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

    private static class Node<E> {
        E item;
        Node<E> next;

        public Node(E item) {
            this.item = item;
        }

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            Node<E> navi = this;
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
}
