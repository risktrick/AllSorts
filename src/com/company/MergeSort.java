package com.company;

public class MergeSort extends BaseSort {
    public MergeSort(int capacity) {
        super(capacity);
    }

    @Override
    long sort() {
        print();

        int[] result = new int[size];

        int a1 = 0;
        final int a2 = (size - 1) /2;

        int b1 = a2 + 1;
        final int b2 = size - 1;

        int resultCounter = 0;


        System.out.print("a1 ... a2: ");
        for (int i = a1; i <= a2; i++) {
            System.out.print(array[i] + "\t");
        }
        System.out.println();

        System.out.print("b1 ... b2: ");
        for (int i = b1; i <= b2; i++) {
            System.out.print(array[i] + "\t");
        }
        System.out.println();

        while (true) {
            if (a1 > a2) {
                System.out.println("сливаем весь B в result");
                for (int i = b1; i <= b2; i++) {
                    result[resultCounter] = array[b1];
                    b1++;                   // rudiment
                    resultCounter++;        // rudiment
                }
                break;
            }
            if (b1 > b2) {
                System.out.println("сливаем весь A в result");
                for (int i = a1; i <= a2; i++) {
                    result[resultCounter] = array[a1];
                    a1++;                   // rudiment
                    resultCounter++;        // rudiment
                }

                break;
            }

            int aElement = array[a1];
            int bElement = array[b1];

            System.out.println("comparing: " + aElement + " " + bElement);

            if (aElement < bElement) {
                result[resultCounter] = array[a1];
                a1++;
                resultCounter++;
            } else {
                result[resultCounter] = array[b1];
                b1++;
                resultCounter++;
            }
            System.out.print("result: ");
            for (int i = 0; i < size - 1; i++) {
                System.out.print(result[i] + "\t");
            }
            System.out.println();System.out.println();

        }


        System.out.print("RESULT:");
        for (int i = 0; i <= size - 1; i++) {
            System.out.print(result[i] + "\t");
        }
        System.out.println();
        return 0;
    }


    void mergeSort(int from, int to) {
        if (from == to) {
            return;
        }

        mergeSort(0, (size - 1) /2);
        mergeSort((size - 1) /2 + 1, size - 1);
    }
}
