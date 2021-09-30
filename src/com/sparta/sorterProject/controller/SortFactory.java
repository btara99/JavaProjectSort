package com.sparta.sorterProject.controller;

import com.sparta.sorterProject.model.BubbleSort;
import com.sparta.sorterProject.model.MergeSort;
import com.sparta.sorterProject.model.QuickSort;

public class SortFactory {
    public SortManager getSort(int typeSort) {
        if (typeSort == 0) {
            return new BubbleSort();
        }
        else if(typeSort == 1) {
            return new MergeSort();
        }
        else if(typeSort == 2){
            return new QuickSort();
        }
//     else if(typeSort == 3){
//            return new InsertionSort();
//        }
        return null;
    }
}



