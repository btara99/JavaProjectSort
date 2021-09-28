package com.sparta.sorterProject;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;

public class DisplayManager extends DriverClass{

    ArrayGen arrayGen = new ArrayGen();
    DriverClass driverData = new DriverClass();


    private static final String titleMain = // displays the int text for user
        "\nSORTING PROJECT \n"+
                    "\t************************************************\n" +
                    "\t| Please pick an int number for the array size |\n" +
                    "\t************************************************\n" ;

    private static final String displaySorts = // display the sorts for user
            "\nSORTING PROJECT \n"+
                    "\t**************************************************\n" +
                    "\t|                                                |\n" +
                    "\t|  Pick a number between 0-5 for the sort wanted |\n" +
                    "\t|                                                |\n" +
                    "\t| Type: 0 for Bubble sort                        |\n" +
                    "\t| Type: 1 for Merge sort                         |\n" +
                    "\t| Type: 2 for Quick sort                         |\n" +
                    "\t| Type: 3 for Insertion sort                     |\n" +
                    "\t| Type: 4 for Selection sort                     |\n" +
                    "\t| Type: 5 for Binary Tree based sort             |\n" +
                    "\t**************************************************\n" ;


    public String displayTitle(){
        return titleMain;
    }

    public String displaySorts(){
        return displaySorts;
    }


}
