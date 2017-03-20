package com.company;

public class BubbleSort {
    int capacity;
    int size;
    int[] array;

    public BubbleSort(int capacity) {
        this.capacity = capacity;
        size = 0;
        array = new int[capacity];
    }

    void insert(int value) {
        array[size] = value;
        size++;
    }

    int sort () {
        int counter = 0;
        for (int out = size - 1; out >= 0 ; out--) {
            for (int j = 0; j < out; j++) {     //если условие до j < size - 1, а не j < out то в 2 раза больше проверок внутри цикла!
                counter++;
                if (array[j] > array[j+1]) {
                    int tmp = array[j+1];       //swap(j, j+1)
                    array[j+1] = array[j];
                    array[j] = tmp;
                }
            }
            print();
            System.out.print("from " + 0 + " to " + out + "\t");
        }
        return counter;
    }

    void print() {
        System.out.println();
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + "\t");
        }
    }

}
