package com.sparta.sorterProject;

import java.util.Arrays;

public class BubbleSort implements SortManager{

    DisplayManager displayData = new DisplayManager();
    public static String bubbleSort(int[] arr){
        int temp = 0;
        int n = arr.length;
        for(int i=0; i<n; i++){
            for(int j=1; j<=(n-1); j++){
                if(arr[j-1]>arr[j]){
                    temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return Arrays.toString(arr);
    }

    @Override
    public void displaySortedArr() {
        //DISPLAY SORTED ARRAY
        double startTime = System.nanoTime();
        System.out.println("The sorted array using Bubble sort: " + bubbleSort(displayData.displayArray()));
        double elapsedTime = System.nanoTime() - startTime;
        System.out.println("The time taken for Bubble sort: " + (double)(elapsedTime/1000000000) + " Seconds");

    }
}
