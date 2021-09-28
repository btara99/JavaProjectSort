package com.sparta.sorterProject;

public class DisplayManager {

    private static final String titleMain = // displays the int text for user
        "\nSORTING PROJECT \n"+
                    "\t**********************************************\n" +
                    "\t|                                            |\n" +
                    "\t| Please pick an int number for the array    |\n" +
                    "\t|                                            |\n" +
                    "\t**********************************************\n" ;

    private static final String displaySorts = // display the sorts for user
            "\nSORTING PROJECT \n"+
                    "\t**************************************************\n" +
                    "\t|                                                |\n" +
                    "\t| Please pick a number between 0-5 for the array |\n" +
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
