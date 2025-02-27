package fourth_task.stream_42.my_implementation;

import java.util.Arrays;

public class MyArrayList {
    private int size;
    private int capacity;
    private String[] elements;

    public MyArrayList() {
        capacity = 10;
        size = 0;
        elements = new String[capacity];
    }

    public String[] getElements() {
        return elements;
    }

    public void add(String element) {
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

    public String get(int index) {
        try {

            return elements[index];

        } catch (IndexOutOfBoundsException e) {
            e.printStackTrace();
        }

        return null;
    }

    public void remove(int index) {
        try {
            for (int i = index; i < this.size - 1; i++) {
                this.elements[i] = this.elements[i + 1];
            }
            this.elements[size - 1] = null;
            this.size--;
        } catch (IndexOutOfBoundsException e) {
            e.printStackTrace();
        }

    }

    public void addAll(MyArrayList myArrayList) {
        if (myArrayList.size + this.size > this.capacity) {
            this.elements = Arrays.copyOf(this.elements, myArrayList.size + this.size);
            this.capacity = this.elements.length;
        }

        for (int i = 0; i < myArrayList.size; i++) {
            this.elements[this.size++] = myArrayList.get(i);
        }
    }
}
