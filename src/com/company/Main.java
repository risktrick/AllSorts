package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {

        int size = 10;
        BaseSort sort = new MergeSort(size);
        for (int i = 0; i < size; i++) {
            int random = new Random().nextInt(100) + 1;
            sort.insert(random);
        }

        testBaseSort(sort, "merge");

    }

    static void copmpareSorts() {
        int size = 40_000;
        BaseSort selectionSort = new SelectionSort(size);
        BaseSort bubbleSort = new BubbleSort(size);
        BaseSort insertionSort = new InsertionSort(size);
        for (int i = 0; i < size; i++) {
            int random = new Random().nextInt(100) + 1;
            bubbleSort.insert(random);
            selectionSort.insert(random);
            insertionSort.insert(random);
        }

        testBaseSort(bubbleSort, "Bubble");
        testBaseSort(selectionSort, "Selection");
        testBaseSort(insertionSort, "Insertion");
    }

    static void testBaseSort(BaseSort sort, String name) {
        long before = System.currentTimeMillis();
        long counterBubble = sort.sort();
        long after = System.currentTimeMillis();
        System.out.println("\n counter " + name + "    =\t" + counterBubble + "\t time = " + (after - before));
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
