package com.company;

public class BookMergeSort extends BaseSort {
    public BookMergeSort(int capacity) {
        super(capacity);
    }

    int[] result;

    @Override
    long sort() {

        //print();

        result = new int[size];
        mergeSort(0, size-1);

        //merge(0, (size-1)/2 + 1, size - 1);

        //print();

        return 0;
    }

    void merge(int low, int upStart, int upEnd) {
        //System.out.println("\n __________");

        int a1 = low;
        int a2 = upStart - 1;

        int b1 = upStart;
        int b2 = upEnd;

        int resultCounter = 0;
//        System.out.println( "low = " + low + " " +
//                            "mid = " + upStart +  " " +
//                            "up  = " + upEnd);
//
//        System.out.print("a1 ... a2: ");
//        for (int i = a1; i <= a2; i++) {
//            System.out.print(array[i] + "\t");
//        }
//        System.out.println();
//
//        System.out.print("b1 ... b2: ");
//        for (int i = b1; i <= b2; i++) {
//            System.out.print(array[i] + "\t");
//        }
//        System.out.println();

        while (true) {
            if (a1 > a2) {
//                System.out.println("сливаем весь B в result");
                for (int i = b1; i <= b2; i++) {
                    result[resultCounter] = array[b1];
                    b1++;                   // rudiment
                    resultCounter++;        // rudiment
                }
                break;
            }
            if (b1 > b2) {
//                System.out.println("сливаем весь A в result");
                for (int i = a1; i <= a2; i++) {
                    result[resultCounter] = array[a1];
                    a1++;                   // rudiment
                    resultCounter++;        // rudiment
                }

                break;
            }

            int aElement = array[a1];
            int bElement = array[b1];

//            System.out.println("comparing: " + aElement + " " + bElement);

            if (aElement < bElement) {
                result[resultCounter] = array[a1];
                a1++;
                resultCounter++;
            } else {
                result[resultCounter] = array[b1];
                b1++;
                resultCounter++;
            }
//            System.out.print("result: ");
//            for (int i = 0; i < size - 1; i++) {
//                System.out.print(result[i] + "\t");
//            }
//            System.out.println();
//            System.out.println();
        }
//        System.out.print("RESULT:");
        for (int i = 0; i <= b2 - a1 + 1; i++) {
//            System.out.print(result[i] + "\t");
            array[low + i] = result[i];
        }
//        System.out.println("\n __________\n");
    }


    void mergeSort(int low, int up) {
//        System.out.println("\nmergeSort for:");
//        for (int i = low; i <= up; i++) {
//            System.out.print(array[i] + "\t");
//        }

        if (low == up) {
            return;
        } else {
            int mid = (up + low)/2;

            mergeSort(low, mid);
            mergeSort(mid + 1, up);
            merge(low, mid + 1, up);
        }
    }
}
