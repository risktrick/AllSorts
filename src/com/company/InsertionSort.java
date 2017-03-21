package com.company;

public class InsertionSort extends BaseSort {
    public InsertionSort(int capacity) {
        super(capacity);
    }

    @Override
    long sort() {
        long counter = 0;

        for (int out = 0; out < size - 1; out++) {
            //левее позиции 1 (т.е. позиция 0) элементы частично отсортированы
            int tmp = array[out + 1];

            //если элементы больше tmp смещаем их вправо
            int i = out;
            for (; i >= 0; i--) {
                if (array[i] >= tmp) {
                    counter++;
                    array[i+1] = array[i];
                } else {
                    break;
                }
            }
            array[i+1] = tmp;
        }

        return counter;
    }
}
