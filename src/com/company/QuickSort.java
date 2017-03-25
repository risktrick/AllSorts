package com.company;

public class QuickSort extends BaseSort {
    public QuickSort(int capacity) {
        super(capacity);
    }

    long counter = 0;

    @Override
    long sort() {
        //print();

        int pivot = array[size-1];
        //long separator = partition(0, size - 2, pivot);

        recQuickSort(0, size - 1);

        //print();
        return counter;
    }

    void recQuickSort(int left, int right) {
        if (right - left <= 0) {
            return;
        } else {
            int pivot = array[right];
            int separator = partition(left, right, pivot);
            recQuickSort(left, separator - 1);
            recQuickSort(separator + 1, right);
        }
    }

    private int partitionIt(int left, int right) {

        return 0;
    }

    private int partition(int left, int right, int pivot) {
        //System.out.println("partition for pivot = " + pivot);
        int leftPtr = left;
        int rightPtr = right;

        while (true) {
            //System.out.println();
            while (leftPtr < right && array[leftPtr] < pivot) {
                leftPtr++;
                counter++;
            }
            //System.out.println("left element = " + array[leftPtr]);

            while (rightPtr > left && array[rightPtr] > pivot) {
                rightPtr--;
                counter++;
            }
            //System.out.println("right element = " + array[rightPtr]);

            if (leftPtr>=rightPtr) {
//                System.out.println("leftPtr >= rightPtr");
//                System.out.println("index:\t" + leftPtr + "," + rightPtr);
                break;
            } else {
//                System.out.println("swapping_index:\t\t" + leftPtr + " <-> " + rightPtr);
//                System.out.println("swapping_element:\t" + array[leftPtr] + " <-> " + array[rightPtr]);
                swap(leftPtr,rightPtr);
                leftPtr++;
                rightPtr--;
            }
        }
//        System.out.println("SWAPPING " + array[leftPtr] + "," + array[rightPtr]);
        swap(leftPtr, right);
        return leftPtr; // left index of right part
    }
}
