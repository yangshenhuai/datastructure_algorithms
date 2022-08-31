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

    public static void main(String[] args) {
        System.out.println(Arrays.toString(new ShellSort().shellSort(new int[]{114, 131, 118, 85, 156, 147, 126, 15, 178, 159, 64, 93, 176, 141, 175, 63, 83, 123, 60, 44})));
        System.out.println(Arrays.toString(new ShellSort().shellSort(new int[]{10,8,9,7,6,4,5,2,1})));
        System.out.println(Arrays.toString(new ShellSort().shellSort(new int[]{1})));
    }




}
