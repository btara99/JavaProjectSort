package com.sparta.sorterProject;

import java.util.Arrays;
import java.util.Scanner;

import static java.lang.System.*;

public class DriverClass {

    public static void main(String[] args) {
        DisplayManager displayData = new DisplayManager();
        ArrayGen arrayGen = new ArrayGen();
        Scanner scanner = new Scanner(in);
        //Display the message to the user for array creation
        out.println(displayData.displayTitle());
        int arrayLength = Integer.parseInt(scanner.next());

        System.out.println(Arrays.toString(arrayGen.arrayGen(arrayLength)));
//        System.out.println(displayData.displaySorts());

        System.out.println();



    }


}
