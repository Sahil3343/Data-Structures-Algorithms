package com.sahilmahajan.dsa.SortingAlgorithms;

public class InsertionSort {

    public void InsertionSort() {

        int[] unSortedArray = { 20, 35, -15, 7, 55, 1, -22 };

        int SortedIndex = 0;
        int UnsortedIndex = 1;
        int TempVariable = -1;


        for (int i = UnsortedIndex; i < unSortedArray.length; i++) {
            if (SortedIndex == 0) {
                if (unSortedArray[SortedIndex] > unSortedArray[UnsortedIndex]) {
                    TempVariable = unSortedArray[SortedIndex];
                    unSortedArray[SortedIndex] = unSortedArray[UnsortedIndex];
                    unSortedArray[UnsortedIndex] = TempVariable;
                    SortedIndex++;
                    UnsortedIndex++;
                }
                else {
                    SortedIndex++;
                    UnsortedIndex++;
                }
            }

            TempVariable = unSortedArray[UnsortedIndex];
            int TempIndex = UnsortedIndex;

            for (int k = SortedIndex; k > -1; k--) {
                if (unSortedArray[k] > TempVariable) {
                    unSortedArray[TempIndex] = unSortedArray[k];
                    unSortedArray[k] = TempVariable;
                    TempIndex--;
                }

                if (unSortedArray[k] < TempVariable) {
                    unSortedArray[k + 1] = TempVariable;
                    SortedIndex++;
                    UnsortedIndex++;
                    break;
                }

                if (k == 0 && unSortedArray[k] > TempVariable) {
                    unSortedArray[UnsortedIndex] = unSortedArray[k];
                    unSortedArray[k] = TempVariable;
                    SortedIndex++;
                    UnsortedIndex++;
                }
            }

        }

        System.out.println("Sorted List");
        for (int i : unSortedArray) {
            System.out.println(i);
        }
    }
}
