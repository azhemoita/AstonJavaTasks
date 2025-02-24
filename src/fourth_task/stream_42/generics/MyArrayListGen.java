package fourth_task.stream_42.generics;

import java.util.Arrays;

public class MyArrayListGen<T> {
    private int size;
    private int capacity;
    private T[] elements;
    private T element;

    public MyArrayListGen() {
        capacity = 10;
        size = 0;
        elements = (T[]) new Object[capacity];
        element = null;
    }

    public T[] getElements() {
        return elements;
    }

    public void add(T element) {
        if (size == capacity) {
            grow();
        }
        elements[size] = element;
        size++;
    }

    private void grow() {
        this.elements = Arrays.copyOf(this.elements, this.capacity + (this.capacity / 2));
        this.capacity = elements.length;
    }

    public T get(int index) {
        try {
            for (int i = 0; i < this.elements.length; i++) {
                if (this.elements[index].equals(this.elements[i])) {
                    element = this.elements[i];
                }
            }
        } catch (IndexOutOfBoundsException e) {
            e.printStackTrace();
        }

        return element;
    }

    public void remove(int index) {
        for (int i = index; i < this.elements.length - 1; i++) {
            this.elements[i] = this.elements[i + 1];
        }

        this.size--;
    }

    public void addAll(MyArrayListGen<T> myArrayList) {
        for (int i = 0; i < myArrayList.size; i++) {
            this.add(myArrayList.get(i));
        }
    }
}
