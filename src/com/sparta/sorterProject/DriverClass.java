package com.sparta.sorterProject;

import java.util.Arrays;
import java.util.Scanner;

import static java.lang.System.*;

public class DriverClass {

    public static void main(String[] args) {
        SortFactory sortFactory =  new SortFactory();
        DisplayManager displayData = new DisplayManager();
//        ArrayGen arrayGen = new ArrayGen();
//        BubbleSort bubbleSort = new BubbleSort();
//        Scanner scanner = new Scanner(in);
        //Display the message to the user for array creation
//        System.out.println(displayData.displayTitle());
//        int arrayLength = Integer.parseInt(scanner.next());
//        int[] arrayBefore = arrayGen.arrayGen(arrayLength);
//        System.out.println(Arrays.toString(arrayBefore));
        displayData.displayArray();

        int sortType = 0; // TAKE INPUT FROM USER

        switch(sortType){
            case 0:
                SortManager bubbleSortDisplay = sortFactory.getSort(0);
                bubbleSortDisplay.displaySortedArr();

        }

       //System.out.println(displayData.displaySorts());
        //System.out.println(bubbleSort.bubbleSort(arrayBefore));



    }





}
