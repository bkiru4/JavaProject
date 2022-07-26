package Finished;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class QuickSort {
    public static void main(String[] args){
        List<Integer> nums = new ArrayList<>();
        for(int i = 0; i <10; i++){
            nums.add(10-i);
        }
            System.out.println("Unsorted Array: "+ nums);

        quickSort(nums,0,nums.size()-1);

            System.out.println("Sorted Array: "+ nums);
    }
    public static void quickSort(List<Integer> list, int start, int end ){
        if(start<end){
            int pivot = start;
            int left = start+1;
            int right = end;
            int pivotValue = list.get(pivot);

            while (left <= right){
                while (left <= end && pivotValue >= list.get(left)){
                    left++;
                }
                while (right > start && pivotValue < list.get(right)){
                    right--;
                }
                if(left<right){
                    Collections.swap(list, left, right);
                }
            }
            Collections.swap(list,pivot,left-1);
            quickSort(list, start, right-1);
            quickSort(list,right+1,end);
        }
    }
}
