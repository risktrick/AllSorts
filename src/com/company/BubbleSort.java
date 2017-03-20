package com.company;

public class BubbleSort extends BaseSort{

    public BubbleSort(int capacity) {
        super(capacity);
    }

    long sort () {
        long counter = 0;
        for (int out = size - 1; out >= 0 ; out--) {
            for (int j = 0; j < out; j++) {     //если условие до j < size - 1, а не j < out то в 2 раза больше проверок внутри цикла!
                if (array[j] > array[j+1]) {
                    counter++;
                    swap(j, j+1);
                }
            }
            //print();
            //System.out.print("from " + 0 + " to " + out + "\t");
        }
        return counter;
    }



}
