package ArrayStuff;
import java.util.*;

public class ArrayList<E> implements List<E>{
    private Object[] elements;
    private int size;

    public ArrayList() {
        // Object arrays need to be recast to a nother type.
        this.elements = new Object[2];
        this.size = 0;
    }

    @Override
    public void set(int index, E value) {
        this.elements[index] = value;
        this.size++;
    }

    @Override
    public E get(int index) {
        this.size--;
        return (E) this.elements[index];
    }

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public String toString() {
        return this.size() + ", [" + Arrays.toString(this.elements) + "]";
    }

    @Override
    public void append(E value) {
        if (this.size == this.elements.length) {
            Object[] holder = Arrays.copyOf(this.elements, (this.size * 2));
            this.elements = holder;
        }
        this.elements[this.size()] = value;
        this.size++;
    }
@Override
public Iterator<E> iterator() {
    Iterator<E> iteratorE = new ArrayIterator<>(this.elements,this.size);
    return iteratorE;
}
    public static void main(String[] args) {
        ArrayList<Integer> x = new ArrayList<>();
        x.append(22);
        System.out.println(x.toString());
        x.append(33);
        System.out.println(x.toString());
        x.append(44);
        System.out.println(x.toString());
      
}
}
