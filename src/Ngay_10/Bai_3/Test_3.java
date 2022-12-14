package Ngay_10.Bai_3;

import java.util.Arrays;

public class Test_3<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private E[] data;

    public Test_3() {
        data = (E[]) new Object[DEFAULT_CAPACITY];
    }

    public Test_3(int size) {
        data = (E[]) new Object[size];
    }

    private void ensureCapa() {
        if (size > data.length) {
            int biggerSize = size * 2 + 1;
            data = Arrays.copyOf(data, biggerSize);
        }
    }

    public void add(E e) {
        size += 1;
        ensureCapa();
        data[size - 1] = e;
    }

    public boolean add(int index, E e) {
        if (index >= 0 && index <= size) {
            size += 1;
            ensureCapa();
            for (int i = size - 2; i >= index; i--) {
                data[i + 1] = data[i];
            }
            data[index] = e;
            return true;
        }
        return false;
    }

    public Object[] getData() {
        return this.data;
    }

    public Object get(int index) {
        if (index >= 0 && index < size) {
            return data[index];
        }
        return null;
    }

    public void clear() {
        data = (E[]) new Object[DEFAULT_CAPACITY];
        size = 0;
    }

    public int size() {
        return size;
    }

    public boolean remove(int index) {
        if (index >= 0 && index < size) {
            for (int i = index; i < size; i++) {
                data[i] = data[i + 1];
            }
            size -= 1;
            return true;
        }
        return false;
    }

    public int indexOf(E e) {
        for (int i = 0; i < size; i++) {
            if (data[i].equals(e)) {
                return i;
            }
        }
        return -1;
    }

    public boolean contains(E e) {
        for (Object x : data) {
            if (e.equals(x)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public Test_3 clone() {
        Test_3<E> clone = new Test_3<>(data.length);
        for (E x : data) {
            clone.add(x);
        }
        return clone;
    }


}
