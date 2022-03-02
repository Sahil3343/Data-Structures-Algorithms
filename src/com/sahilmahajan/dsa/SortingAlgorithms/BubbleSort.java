package com.sahilmahajan.dsa.SortingAlgorithms;

public class BubbleSort {

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
}
