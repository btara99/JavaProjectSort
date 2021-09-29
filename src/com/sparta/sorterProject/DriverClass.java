package com.sparta.sorterProject;

import java.util.Arrays;
import java.util.Scanner;

import static java.lang.System.*;

public class DriverClass {

    public static void main(String[] args) {
        SortFactory sortFactory =  new SortFactory();
        DisplayManager displayData = new DisplayManager();


        System.out.println(displayData.displaySorts());
        try{
            Scanner scanner = new Scanner(in);
            int sortType= Integer.parseInt(scanner.next());
            switch(sortType){
                case 0:
                SortManager bubbleSortDisplay = sortFactory.getSort(0);
                bubbleSortDisplay.displaySortedArr();
                break;

            }

        }
        catch (Exception e) {
            e.printStackTrace();
        }

        //System.out.println(displayData.displaySorts());

    }





}
