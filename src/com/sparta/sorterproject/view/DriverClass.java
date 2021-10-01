package com.sparta.sorterproject.view;

import com.sparta.sorterproject.controller.DisplayManager;
import com.sparta.sorterproject.controller.SortFactory;
import com.sparta.sorterproject.controller.SortManager;

import java.text.ParseException;
import java.util.InputMismatchException;
import java.util.Scanner;
import static java.lang.System.*;

public class DriverClass {

    public static void main(String[] args) {
        SortFactory sortFactory =  new SortFactory();
        DisplayManager displayData = new DisplayManager();
        int status = 0;

        while(status == 0) {
            System.out.println(displayData.displaySorts()); //Displays the menu for the sorts
            try {
                Scanner scanner = new Scanner(in);
                int sortType = Integer.parseInt(scanner.next());
                switch (sortType) {
                    case 0:
                        SortManager bubbleSortDisplay = sortFactory.getSort(0);
                        bubbleSortDisplay.displaySortedArr();
                        status=1;
                        break;

                    case 1:
                        SortManager mergeSortDisplay = sortFactory.getSort(1);
                        mergeSortDisplay.displaySortedArr();
                        status=1;
                        break;

                    case 2:
                        SortManager quickSortDisplay = sortFactory.getSort(2);
                        quickSortDisplay.displaySortedArr();
                        status=1;
                        break;

                    case 3:
                        SortManager insertionSortDisplay = sortFactory.getSort(3);
                        insertionSortDisplay.displaySortedArr();
                        status=1;
                        break;

                    case 4:
                        SortManager selectionSortDisplay = sortFactory.getSort(4);
                        selectionSortDisplay.displaySortedArr();
                        status=1;
                        break;

                default:
                    System.err.println("Incorrect number in range please select a number between 0-5");

                }

            } catch (NumberFormatException n) {
                System.err.println("Incorrect input " + n.getMessage());

            }
        }



    }



}
