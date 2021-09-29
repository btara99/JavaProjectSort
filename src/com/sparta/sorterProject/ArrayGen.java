package com.sparta.sorterProject;

import java.util.Arrays;
import java.util.Random;

public class ArrayGen extends DriverClass {

    public int[] arrayGen(int arrayLength){
        Random rand = new Random(); // creating Random object
        int[] arr = new int[arrayLength];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(1000); // storing random ints into an array
            //System.out.println(arr[i]); // printing each array element
        }
        return arr;
    }



}
