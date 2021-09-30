package com.sparta.sorterProject;

import java.util.Arrays;

public class QuickSort implements SortManager {
    DisplayManager displayData = new DisplayManager();

    public void quickSort(int arr[], int begin, int end) {
       begin = 0;
       end = arr.length;

        if (begin < end) {
            int partitionIndex = partition(arr, begin, end);

            quickSort(arr, begin, partitionIndex-1);
            quickSort(arr, partitionIndex+1, end);
        }
        System.out.println(arr);
    }

    private int partition(int arr[], int begin, int end) {
        int pivot = arr[end];
        int i = (begin-1);

        for (int j = begin; j < end; j++) {
            if (arr[j] <= pivot) {
                i++;
                int swapTemp = arr[i];
                arr[i] = arr[j];
                arr[j] = swapTemp;
            }
        }

        int swapTemp = arr[i+1];
        arr[i+1] = arr[end];
        arr[end] = swapTemp;

        return i+1;
    }

    public void displaySortedArr() {
        double startTime = System.nanoTime();
       // quickSort(displayData.displayArray(), 0, 2);
        System.out.println("The sorted array using Quick sort: ");
        double elapsedTime = System.nanoTime() - startTime;
        System.out.println("The time taken for Quick sort: " + (double)(elapsedTime/1000000000) + " Seconds");
    }
}
