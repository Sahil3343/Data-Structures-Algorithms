package com.sahilmahajan.dsa.SortingAlgorithms;

public class SelectionSort {

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
