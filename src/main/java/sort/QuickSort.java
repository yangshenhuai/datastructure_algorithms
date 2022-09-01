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


}
