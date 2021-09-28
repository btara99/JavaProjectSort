package com.sparta.sorterProject;

public class BubbleSort {

    public static void bubbleSort(double[] arr){
        double temp = 0;
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
    }
}
