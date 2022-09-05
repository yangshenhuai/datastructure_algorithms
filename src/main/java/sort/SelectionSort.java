package sort;

import java.util.Arrays;

public class SelectionSort {


    public int[] selectionSort(int[] input){

        for (int i=0;i<input.length-1;i++){
            int min = input[i];
            int minIndex = i;
            for (int j=i+1;j<input.length;j++){
                if (input[j] < min){
                    min = input[j];
                    minIndex = j;
                }
            }

            if (minIndex != i){
                int temp = input[i];
                input[i] = input[minIndex];
                input[minIndex] = temp;
            }

        }
        return input;
    }



}
