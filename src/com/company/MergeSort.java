package com.company;

public class MergeSort extends BaseSort {
    public MergeSort(int capacity) {
        super(capacity);
    }

    @Override
    long sort() {
        //print();

        array = mergeSort(array);

        //print();

        return 0;
    }

    int[] mergeOriginalArray(int[] a, int[] b) {
        int[] result = new int[size];

        int a1 = 0;
        int a2 = a.length - 1;

        int b1 = 0;
        int b2 = b.length - 1;


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
            System.out.println();
            System.out.println();
        }
        System.out.print("RESULT:");
        for (int i = 0; i <= size - 1; i++) {
            System.out.print(result[i] + "\t");
        }
        System.out.println();
        return result;
    }

    int[] merge(int[] a, int[] b) {
        int[] result = new int[a.length + b.length];

        int a1 = 0;
        int a2 = a.length - 1;

        int b1 = 0;
        int b2 = b.length - 1;


        int resultCounter = 0;


//        System.out.print("\na1 ... a2: ");
//        for (int i = a1; i <= a2; i++) {
//            System.out.print(a[i] + "\t");
//        }
//        System.out.println();
//
//        System.out.print("b1 ... b2: ");
//        for (int i = b1; i <= b2; i++) {
//            System.out.print(b[i] + "\t");
//        }
//        System.out.println();

        while (true) {
            if (a1 > a2) {
                //System.out.println("сливаем весь B в result");
                for (int i = b1; i <= b2; i++) {
                    result[resultCounter] = b[b1];
                    b1++;                   // rudiment
                    resultCounter++;        // rudiment
                }
                break;
            }
            if (b1 > b2) {
                //System.out.println("сливаем весь A в result");
                for (int i = a1; i <= a2; i++) {
                    result[resultCounter] = a[a1];
                    a1++;                   // rudiment
                    resultCounter++;        // rudiment
                }

                break;
            }

            int aElement = a[a1];
            int bElement = b[b1];

            //System.out.println("comparing: " + aElement + " " + bElement);

            if (aElement < bElement) {
                result[resultCounter] = a[a1];
                a1++;
                resultCounter++;
            } else {
                result[resultCounter] = b[b1];
                b1++;
                resultCounter++;
            }
            //System.out.print("result: ");
//            for (int i = 0; i < result.length - 1; i++) {
//                System.out.print(result[i] + "\t");
//            }
            //System.out.println();
            //System.out.println();
        }
        //System.out.print("RESULT:");
//        for (int i = 0; i <= result.length - 1; i++) {
//            System.out.print(result[i] + "\t");
//        }
        //System.out.println();
        return result;
    }

    int[] mergeSort(int[] arr) {

        //System.out.println("\nmergeSort for:");

//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i] + "\t");
//        }

        if (arr.length >= 2) {
            int arrSize = arr.length;
            int leftSize = arrSize/2;
            int rightSize = arrSize - leftSize;
            int[] left = new int[leftSize];
            int[] right = new int[rightSize];

            for (int j=0, i = 0; i <= leftSize - 1;j++, i++) {
                left[j] = arr[i];
            }

            for (int j=0, i = leftSize; i <= arr.length - 1; j++, i++) {
                right[j] = arr[i];
            }

            int[] a = mergeSort(left);
            int[] b = mergeSort(right);
            return merge(a, b);
        } else {
            return arr;
        }

    }
}
