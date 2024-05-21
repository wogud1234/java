package _06_컬렉션프레임워크.ArrayList.step03_리스트추상화_인터페이스;

public interface List<E> {

    int size();

    void add(E e);

    void add(int index, E e);

    E get(int index);

    E set(int index, E element);

    E remove(int index);

    int indexOf(E o);
}
