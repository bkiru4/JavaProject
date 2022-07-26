package Finished;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TwoPointerSort {

    public static void main(String[] args){
        List<Integer> nums = new ArrayList<>();
        for(int i = 0; i <10; i++){
            nums.add(10-i);
        }
        System.out.println("Unsorted Array: "+ nums);

        twoPointerSort(nums,0,nums.size()-1);

        System.out.println("Sorted Array: "+ nums);
    }

    public static void twoPointerSort(List<Integer> list, int start, int end){
        int lidx = start;
        int ridx = end;
        if(list.get(lidx)>list.get(ridx)){
            Collections.swap(list,lidx,ridx);
            ridx--;
        }
    }


}
