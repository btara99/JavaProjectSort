package com.sparta.sorterProject.view;

import com.sparta.sorterProject.controller.DisplayManager;
import com.sparta.sorterProject.controller.SortFactory;
import com.sparta.sorterProject.controller.SortManager;

import java.util.Scanner;
import static java.lang.System.*;

public class DriverClass {

    public static void main(String[] args) {
        SortFactory sortFactory =  new SortFactory();
        DisplayManager displayData = new DisplayManager();

        System.out.println(displayData.displaySorts()); //Displays the menu for the sorts
        try{
            Scanner scanner = new Scanner(in);
            int sortType= Integer.parseInt(scanner.next());
            switch(sortType){
                case 0:
                    SortManager bubbleSortDisplay = sortFactory.getSort(0);
                    bubbleSortDisplay.displaySortedArr();
                    break;

                case 1:
                    SortManager mergeSortDisplay = sortFactory.getSort(1);
                    mergeSortDisplay.displaySortedArr();
                    break;

                case 2:
                    SortManager quickSortDisplay = sortFactory.getSort(2);
                    quickSortDisplay.displaySortedArr();
                    break;

                case 3:
                    SortManager insertionSortDisplay = sortFactory.getSort(3);
                    insertionSortDisplay.displaySortedArr();
                    break;

                case 4:
                    SortManager selectionSortDisplay = sortFactory.getSort(3);
                    selectionSortDisplay.displaySortedArr();
                    break;

                default:
                    System.out.println("Please select a number between 0-5");
                    break;

            }

        }
        catch (Exception e) {
            //e.printStackTrace();
            System.out.println("Wrong input");
        }


    }



}
