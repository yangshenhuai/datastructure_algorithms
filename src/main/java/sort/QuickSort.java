package sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class QuickSort {


    private List<Integer> quickSort(List<Integer> input){

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


    public static void main(String[] args) {
        System.out.println(new QuickSort().quickSort(Arrays.asList(10,5,3,2,20,30,1,4,5)));
    }
}
