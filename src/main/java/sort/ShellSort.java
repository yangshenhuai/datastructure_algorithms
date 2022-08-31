package sort;

import java.util.Arrays;

public class ShellSort {

    public int[] shellSort(int[] input){

        int stepSize = input.length / 2;

        int temp ;
        while (stepSize > 0){
            for (int i = stepSize  ; i< input.length;i++){
                int j = i;
                int num = input[j];
                while ((j-stepSize) >= 0 && input[j-stepSize] > num ){
                    input[j] = input[j - stepSize] ;
                    j = j - stepSize;
                }
                input[j] = num;
            }

            stepSize = stepSize / 2;
        }


        return input;
    }


}
