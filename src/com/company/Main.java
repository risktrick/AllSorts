package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {

        BubbleSort bubbleSort = new BubbleSort(15);
        for (int i = 0; i < 15; i++) {
            int random = new Random().nextInt(100) + 1;
            bubbleSort.insert(random);
        }

        //bubbleSort.print();
        int count = bubbleSort.sort();
        //bubbleSort.print();

    }

}
