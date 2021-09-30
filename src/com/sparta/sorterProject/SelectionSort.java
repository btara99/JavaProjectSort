package com.sparta.sorterProject;

public class SelectionSort implements SortManager{
    DisplayManager displayData = new DisplayManager();


    public void displaySortedArr() {
        //DISPLAY SORTED ARRAY
        double startTime = System.nanoTime();
        System.out.println("The sorted array using Selection sort: ");
        double elapsedTime = System.nanoTime() - startTime;
        System.out.println("The time taken for Selection sort: " + (double)(elapsedTime/1000000000) + " Seconds");

    }
}
