package Finished;

import java.util.HashMap;

public class HowSumProblem {
    public static void main(String[] args) {
        HashMap<Long, String> memo = new HashMap<>();
        Long[] values = new Long[]{31L,10L,11L,5L};
        String s = can(30, values, memo);
        System.out.println();
        if (s == null){
            System.out.println("null");
        }else{
            System.out.println("["+s+"]");
        }
        System.out.println(memo);
    }
    public static String can(long sum, Long[] values, HashMap<Long, String> memo) {
        if (memo.containsKey(sum)) {
            return memo.get(sum);
        }
        if (sum == 0) {
            memo.put(sum,"");
            return memo.get(sum);
        }
        if (sum < 0) {
            return null;
        }
        for (Long i : values) {
            String nums = can(sum-i,values,memo);
            if(nums!=null){
                if(nums==""){
                    nums=nums+i;
                }else {
                    nums = nums + "," + i;
                }
                memo.put(sum,nums);
                return memo.get(sum);
            }
        }
        return null;
    }
}
