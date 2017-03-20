package com.company;

public class SelectionSort extends BaseSort {
    public SelectionSort(int capacity) {
        super(capacity);
    }

    @Override
    long sort() {
        long counter = 0;
        for (int out = 0; out < size - 1; out++) {
            int min_index = out;    //update from inner loop
            for (int in = out; in < size -1; in++) {
                if (array[min_index] > array[in + 1]) {     //ищем минимальный, изначально такового нет, только позиция для него
                    counter++;
                    min_index = in + 1;
                }
            }
            swap(out, min_index);
            //print();
        }
        return counter;
    }

}
