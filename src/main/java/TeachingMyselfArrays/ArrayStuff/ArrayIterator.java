package ArrayStuff;
import java.util.*;

public class ArrayIterator<E> implements Iterator<E> {
    private Object[] elements;
    private int index;
    private int size;

    public ArrayIterator(Object[] elements, int size) {
        this.elements = elements;
        this.size = size;
        this.index = 0;
    }

    @Override
    public boolean hasNext() {

        return this.index < this.size;
    }

    @Override
    public E next() {
        E variable = (E) this.elements[index];
        index++;
        return variable;
    }
}
