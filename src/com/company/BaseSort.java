package com.company;

public abstract class BaseSort {
    int capacity;
    int size;
    int[] array;

    public BaseSort(int capacity) {
        this.capacity = capacity;
        size = 0;
        array = new int[capacity];
    }

    void insert(int value) {
        if (size < capacity) {
            array[size] = value;
            size++;
        } else {
            throw new RuntimeException("out of bounds! size = " + size + " capacity = " + capacity);
        }
    }

    abstract long sort ();

    void print() {
        //System.out.println();
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + "\t");
        }
        System.out.println();
    }

    void swap(int from, int to) {
        int tmp = array[from];       //swap(j, j+1)
        array[from] = array[to];
        array[to] = tmp;
    }

}

