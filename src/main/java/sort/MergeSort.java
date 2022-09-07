package sort;

public class MergeSort {

    public void mergeSort(int[] input,int left,int right){

        if (left < right){
            int mid = left + ((right - left) >>1);
            mergeSort(input,left,mid);
            mergeSort(input,mid+1,right);
            merge(input,left,mid,right);
        }
    }

    private void merge(int[] input, int left, int mid, int right) {
        int lCount = mid - left + 1;
        int rCount = right - mid;
        int[] lArr = new int[lCount];
        int[] rArr = new int[rCount]; //create temp index
        int lIdx = 0;
        int rIdx = 0;
        int index = left;
        for (int i=left;i<=mid;i++){ //copy to temp index
            lArr[lIdx++] = input[i];
        }
        for (int i=mid+1;i<=right;i++){
            rArr[rIdx++] = input[i];
        }
        lIdx =0;
        rIdx=0;

        while (lIdx <= lCount - 1 && rIdx<= rCount -1 ){ //merge
            if (lArr[lIdx] <= rArr[rIdx]){
                input[index] = lArr[lIdx];
                index++;
                lIdx++;
            } else {
                input[index] = rArr[rIdx];
                index++;
                rIdx++;
            }
        }

        while (lIdx <= lCount - 1){ //copy the remaining items
            input[index] = lArr[lIdx];
            index++;
            lIdx++;
        }
        while (rIdx <= rCount -1){
            input[index] = rArr[rIdx];
            index++;
            rIdx++;
        }

    }


}
