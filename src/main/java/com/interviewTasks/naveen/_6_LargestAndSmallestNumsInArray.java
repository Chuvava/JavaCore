package com.interviewTasks.naveen;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class _6_LargestAndSmallestNumsInArray {

    public static void main(String[] args) {

        int[] array = {213, 25, 0, 17, -7, 4666, 90};


        //my solution
//        int max = array[0], min = array[0];
//        for(int i = 0; i < array.length; i ++){
//            if(array[i] > max) max = array[i];
//            else if(array[i] < min) min = array[i];
//        }

        //naveen 1.
        int max = array[0];
        int min = array[0];

        for(int i = 0; i < array.length; i++){
            if(array[i] > max){
                max = array[i];
            } else if (array[i] < min){
                min = array[i];
            }
        }

        System.out.println("Max : " + max);
        System.out.println("Min : " + min);

    }
}
