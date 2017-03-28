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
        int leftChildIndex  = 2*index + 1;
        int rightChildIndex = 2*index + 2;

        //если вообще существует левый и правый потомок
        if (leftChildIndex <= size) {
            if (rightChildIndex <= size) {

            }
        }

        // и если они больше значения

        //если существуют оба  -- выбираем наибольший и swap

        //если только один то с ним

        if (array[index] > array[leftChildIndex] && array[index] > array[rightChildIndex]) {
            return;
        } else {
            if (array[index] < array[leftChildIndex]){
                //swap with left
            }
            if (array[index] < array[rightChildIndex]){
                //swap with right
            }
        }
    }
}
