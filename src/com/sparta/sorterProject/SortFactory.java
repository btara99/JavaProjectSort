package com.sparta.sorterProject;

public class SortFactory {
    public SortManager getSort(int typeSort) {
        if (typeSort == 0) {
            return new BubbleSort();

        }
        else if(typeSort == 1){
            return null;
//
//        } else if(typeSort == 2)){
//            return new ();
//        }
        }
        return null;
    }
}
