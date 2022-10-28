import java.util.Arrays;

public class ArrayListPractice<E> {
    //    private int size = 0;
    static final int DEFAULT_CAPACITY = 1;
    public Object[] elements;

    public ArrayListPractice() {
        elements = new Object[0];
    }

    public ArrayListPractice(int capacity) {
        elements = new Object[capacity];
    }

    public void increaseSizeElements() {
        elements = Arrays.copyOf(elements, elements.length + 1);
    }

    public void decreaseSizeElements() {
        elements = Arrays.copyOf(elements, elements.length - 1);
    }

    public void clear(){
        for (int i = elements.length - 1; i >=0 ; i--) {
            this.remove(i);
        }
    }

    public void add(E element) {
        increaseSizeElements();
        elements[elements.length - 1] = element;
    }

    public void add(int index, E element) {
        if (index > elements.length || index < 0) {
            System.out.println("Out of bound!");
        } else {
            increaseSizeElements();
            for (int i = elements.length - 1; i >= index; i--) {
                if (i == index) {
                    elements[index] = element;
                } else {
                    elements[i] = elements[i - 1];
                }
            }
        }
    }

    public E remove(int index) {
        E element = (E) elements[index];
        for (int i = index; i < elements.length - 1; i++) {
            elements[i] = elements[i + 1];
        }
        decreaseSizeElements();
        return element;
    }

    public boolean remove(Object obj) {
        boolean flag = false;
        int count = 0;
        for (int i = 0; i < elements.length; i++) {
            if (obj.equals(elements[i])) {
                remove(i);
                count++;
                return flag = true;
            } else if (count == 0 && i == elements.length - 1) {
                return flag = false;
            }
        }
        return flag;
    }

    public int size() {
        int size = elements.length;
        return size;
    }

    public Object clone() {
        ArrayListPractice<E> clone = new ArrayListPractice<>();
        for (Object item : elements) {
            clone.add((E) item);
        }
        return clone;
    }

    public boolean contains(Object obj) {
        boolean flag = false;
        int count = 0;
        for (int i = 0; i < elements.length; i++) {
            if (obj.equals(elements[i])) {
                count++;
                flag = true;
            } else if (count == 0 && i == elements.length - 1) {
                flag = false;
            }
        }
        return flag;
    }

    public int indexOf(Object obj) {
        int num = 0, count = 0;
        for (int i = 0; i < elements.length; i++) {
            if (obj.equals(elements[i])) {
                num = i;
                count++;
                break;
            } else if (count == 0 && i == elements.length - 1) {
                num = -1;
            }
        }
        return num;
    }
    public E get(int index){
        if (index>=elements.length || index <0){
            throw new IndexOutOfBoundsException("Warning: out of bound!");
        }
        return (E)elements[index];
    }

    public String toString() {
        String str = "";
        for (Object item : elements) {
            str += item + " ";
        }
        return str;
    }


    public static void main(String[] args) {
    }
}
