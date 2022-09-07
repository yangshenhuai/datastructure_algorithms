package sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class QuickSort {


    public List<Integer> quickSort(List<Integer> input){

        if (input.size() <=1 ){
            return input;
        }

        int pivot = input.get(0);

        List<Integer> leftPart =
                input.stream().filter( it -> it < pivot).collect(Collectors.toList());



        List<Integer> rightPart =
                input.stream().filter( it -> it > pivot).collect(Collectors.toList());


        List<Integer> result = new ArrayList<>();
        result.addAll(quickSort(leftPart));
        result.add(pivot);
        result.addAll(quickSort(rightPart));
        return result;
    }



    public void qsort(int[] input,int low,int high){

        if (low < high){
            int p = partition(input,low,high);
            qsort(input,low,p-1);
            qsort(input,p+1,high);
        }

    }

    private int partition(int[] input, int low, int high) {
        int i = low - 1; //i is the pointer to last less than the pivot
        int pivot = input[high];
        for (int j=low;j<high;j++){ //j is the traverse pointer
            if (input[j] < pivot){
                i++;
                swap(input,i,j);
            }
        }
        swap(input,i+1,high);
        return i + 1;
    }

    private void swap(int[] input, int low, int high) {
        int temp = input[low];
        input[low] = input[high];
        input[high] = temp;
    }




}
