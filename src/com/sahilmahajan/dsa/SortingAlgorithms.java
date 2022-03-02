package com.sahilmahajan.dsa;

public class SortingAlgorithms {

    public void BubbleSort() {
        int[] unSortedArray = { 20, 35, -15, 7, 55, 1, -22 };

        for (int value : unSortedArray) {
            System.out.println(value);
        }

        for (int k = 0; k < unSortedArray.length; k++) {
            for (int i = 0; i < unSortedArray.length; i++) {
                int NextPosition = i + 1;
                int TempVariable = 0;
                if (NextPosition >= unSortedArray.length) {
                    break;
                }
                else {
                    if (unSortedArray[i] >= unSortedArray[NextPosition]) {
                        TempVariable = unSortedArray[i];
                        unSortedArray[i] = unSortedArray[NextPosition];
                        unSortedArray[NextPosition] = TempVariable;
                    }
                }
            }
        }

        System.out.println("Sorted List");
        for (int i : unSortedArray) {
            System.out.println(i);
        }

    }

    public void SelectionSort() {
        int[] unSortedArray = { 20, 35, -15, 7, 55, 1, -22 };

        int UnSortedLength = unSortedArray.length;

        for (int i = unSortedArray.length; i > 1; i--) {
            int largest = 0;
            for (int k = 1; k < UnSortedLength; k++) {
                if (unSortedArray[k] > unSortedArray[largest]) {
                    largest = k;
                }
                if (k == UnSortedLength - 1) {
                    int temp = unSortedArray[k];
                    unSortedArray[k] = unSortedArray[largest];
                    unSortedArray[largest] = temp;
                    UnSortedLength -= 1;
                }
            }
        }

        for (int j = 0; j < unSortedArray.length; j++) {
            System.out.println(unSortedArray[j]);
        }

    }
}
