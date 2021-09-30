package com.sparta.sorterProject.model;

import com.sparta.sorterProject.controller.DisplayManager;
import com.sparta.sorterProject.controller.SortManager;

import java.util.Arrays;

public class InsertionSort implements SortManager {

    DisplayManager displayData = new DisplayManager();

    public static String insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int current = arr[i];
            int j = i - 1;
            while(j >= 0 && current < arr[j]) {
                arr[j+1] = arr[j];
                j--;
            }
            // at this point we've exited, so j is either -1
            // or it's at the first element where current >= a[j]
            arr[j+1] = current;
        }
        return Arrays.toString(arr);
    }



    public void displaySortedArr() {
        //DISPLAY SORTED ARRAY
        double startTime = System.nanoTime();
        System.out.println("The sorted array using Insertion sort: " + insertionSort(displayData.displayArray()));
        double elapsedTime = System.nanoTime() - startTime;
        System.out.println("The time taken for Insertion sort: " + (double)(elapsedTime/1000000000) + " Seconds");

    }
}
