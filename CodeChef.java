package Finished;

import java.util.HashMap;

public class CodeChef {
    public static void main(String[] args) {
        HashMap<Integer, String> memo = new HashMap<>();

        System.out.println(bestSum(7,new int[]{5,3,4,7},memo));
        memo.clear();
        System.out.println(bestSum(8,new int[]{2,3,5},memo));
        memo.clear();
        System.out.println(bestSum(8,new int[]{1,4,5},memo));
        memo.clear();
        System.out.println(bestSum(100,new int[]{1,2,5,25},memo));
        System.out.println(memo);

    }
    public static String bestSum(int sum, int[]values,HashMap<Integer,String>memo){
        if(memo.containsKey(sum)){return memo.get(sum);}
        if(sum == 0){return "";}
        if(sum < 0){return null;}
        String shortest = null;
        for(int i : values){
            String result = bestSum(sum-i,values,memo);
            if(result != null){
                result = result +" "+ i;
                if(shortest==null || result.length() < shortest.length()){
                    shortest = result;
                }
            }
        }
        memo.put(sum, shortest);
        return shortest;
    }

}