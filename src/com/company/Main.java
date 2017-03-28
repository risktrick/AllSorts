package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {

        int size = 10;
        HeapSort sort = new HeapSort(size);
//        for (int i = 0; i < size; i++) {
//            int random = new Random().nextInt(100) + 1;
//            sort.insert(random);
//        }

        sort.insert(91);    //0
        sort.insert(58);    //1
        sort.insert(78);
        sort.insert(53);    //3
        sort.insert(42);
        sort.insert(17);    //5
        sort.insert(29);
        sort.insert(2);     //7
        sort.insert(50);
        sort.insert(36);    //9

        sort.print();


//        testBaseSort(sort, "HeapSort");


//        copmpareSorts();
    }

    static void copmpareSorts() {
        int size = 10_000_000;
        BaseSort selectionSort = new SelectionSort(size);
        BaseSort bubbleSort = new BubbleSort(size);
        BaseSort insertionSort = new InsertionSort(size);
        BaseSort mergeSort = new MergeSort(size);
        BaseSort bookMergeSort = new BookMergeSort(size);
        BaseSort quickSort = new QuickSort(size);
        for (int i = 0; i < size; i++) {
            int random = new Random().nextInt(10000) + 1;
            bubbleSort.insert(random);
            selectionSort.insert(random);
            insertionSort.insert(random);
            mergeSort.insert(random);
            bookMergeSort.insert(random);
            quickSort.insert(random);
        }

//        testBaseSort(bubbleSort, "Bubble");
//        testBaseSort(selectionSort, "Selection");
//        testBaseSort(insertionSort, "Insertion");
        testBaseSort(mergeSort, "Merge");
        testBaseSort(bookMergeSort, "bookMerge");
        testBaseSort(quickSort, "QuickSort");
    }

    static void testBaseSort(BaseSort sort, String name) {
        long before = System.currentTimeMillis();
        long counterBubble = sort.sort();
        long after = System.currentTimeMillis();
        System.out.println("\n" + name + " counter =\t" + counterBubble + "\t time = " + (after - before));
    }

    static void testSelection() {
        BaseSort sort = new SelectionSort(15);
        for (int i = 0; i < 15; i++) {
            int random = new Random().nextInt(100) + 1;
            sort.insert(random);
        }

        sort.print();
        long count = sort.sort();
        sort.print();
    }

    static void testBubble() {
        BubbleSort bubbleSort = new BubbleSort(15);
        for (int i = 0; i < 15; i++) {
            int random = new Random().nextInt(100) + 1;
            bubbleSort.insert(random);
        }

        bubbleSort.print();
        long count = bubbleSort.sort();
        bubbleSort.print();
    }

}
