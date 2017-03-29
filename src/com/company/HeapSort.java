package com.company;

public class HeapSort extends BaseSort{
    public HeapSort(int capacity) {
        super(capacity);
    }

    @Override
    long sort() {

        print();

        return 0;
    }

    @Override
    void insert(int a) {
        super.insert(a);
        trickleUp(size - 1);
    }

    private void trickleUp(int index) {             //текущее значение
        int parentIndex = (index - 1) / 2;          //его родитель
        int tmpValue = array[index];                //сохраняем его значение, востанавливаем в конце. здесь дыра.

        while (index > 0) {
            if (array[parentIndex] > tmpValue) {    //если значение_родителя больше сохраненного_значения останавливаемся
                break;
            }

            array[index] = array[parentIndex];      //значение родителя вниз
            index = parentIndex;                    //текущим становится родитель - здесь типа дыра
            parentIndex = (index - 1) / 2;          //вычисляется новый родитель
        }
        array[index] = tmpValue;
    }

    int removeHead() {
        int head = array[0];
        array[0] = array[size - 1];
        size--;
        trickleDown(0);
        return head;
    }

    private void trickleDown(int index) {
        int headValue = array[index];

        while (index <= size - 1) {
            System.out.println("current_value = " + array[index] + " current_index = " + index);    //old element value. в index  На самом деле дыра
//            System.out.println("#new index: " + index + " while: " + (size - 1) / 2 + " size = " + size);


            int leftChildIndex = 2 * index + 1;
            int rightChildIndex = 2 * index + 2;

            if (leftChildIndex <= size - 1 && rightChildIndex <= size - 1) {    //если вообще существуют оба
                System.out.println( "headValue = " + headValue +
                                    " left = " + array[leftChildIndex] +
                                    " right = " + array[rightChildIndex]);

                if (headValue < array[leftChildIndex] || headValue < array[rightChildIndex]) {
                    //поиск наибольшего
                    if (array[leftChildIndex] > array[rightChildIndex]) {
                        array[index] = array[leftChildIndex];
                        index = leftChildIndex; //дыра
                    } else {
                        array[index] = array[rightChildIndex];
                        index = rightChildIndex; //дыра
                    }
                } else {
                    break;
                }
            } else if (leftChildIndex <= size - 1 ) {                           //если существует левый
                if (headValue < array[leftChildIndex]) {
                    array[index] = array[leftChildIndex];
                    index = leftChildIndex; //дыра
                } else {
                    break;
                }
            } else if (rightChildIndex <= size - 1 ) {                          //если существует правый
                if (headValue < array[rightChildIndex]) {
                    array[index] = array[rightChildIndex];
                    index = rightChildIndex; //дыра
                } else {
                    break;
                }
            } else {
                break;
            }
        }
        array[index] = headValue;
    }
}
