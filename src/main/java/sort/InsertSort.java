package sort;

import java.util.Arrays;

public class InsertSort {

    public int[] insertSort(int[] input){
        for (int i=1;i<input.length;i++){
            int j = i-1;
            int num = input[i];
            while (j>=0 && input[j] > num){
                input[j+1] = input[j];
                j--;
            }
            input[j+1] = num;
        }
        return input;
    }


    public static void main(String[] args) {
        System.out.println(Arrays.toString(new InsertSort().insertSort(new int[]{10,5,3,2,20,30,1,4,5})));
    }

}
