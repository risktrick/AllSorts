package com.company;

public class Partition extends BaseSort {
    public Partition(int capacity) {
        super(capacity);
    }

    @Override
    long sort() {
        print();
        long separator = partition(0, size -1, 50);
        print();
        return separator;
    }

    private int partition(int left, int right, int pivot) {
        int leftPtr = left;
        int rightPtr = right;

        while (true) {
            while (leftPtr < right && array[leftPtr] < pivot) {
                leftPtr++;
            }
            while (rightPtr > left && array[rightPtr] > pivot) {
                rightPtr--;
            }

            if (leftPtr>=rightPtr) {
                break;
            } else {
                swap(leftPtr,rightPtr);
            }
        }
        return leftPtr - 1;
    }
}
