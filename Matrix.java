package Finished;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Matrix {

    public static void main(String[] args){
//        List<List<Integer>> list = new ArrayList<List <Integer>>(3);
//        list.add(Arrays.asList(1,2,3,4));
//        list.add(Arrays.asList(5,6,7,8));
//        list.add(Arrays.asList(9,10,11,12));
//        list.add(Arrays.asList(13,14,15,16));
//
//        System.out.println(list);
//        int n = list.size();
//        //reverse order
//        for(int i = 0; i<n; i++){
//            for(int j = 0; j<n/2;j++){
//                int temp = list.get(i).get(j);
//                list.get(i).set(j,list.get(i).get(n-j-1));
//                list.get(i).set(n-j-1, temp);
//            }
//        }
//        System.out.println(list);

        int[][] num = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        System.out.println(Arrays.deepToString(num));
        int len = num.length;
        System.out.println(len);
        for(int i = 0; i<len;i++){
            for(int j=0; j<len/2;j++){
                int temp = num[i][j];
                num[i][j] = num[i][len-j-1];
                num[i][len-j-1]=temp;
            }
        }
        System.out.println(Arrays.deepToString(num));


    }
}
