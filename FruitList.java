package Finished;

import java.util.ArrayList;
import java.util.Arrays;

public class FruitList {
    public static void main(String[] args) {
        String[] fruits = new String[3];
        fruits[0] = "Mango";
        fruits[1] = "Banana";
        fruits[2] = "Pear";

        ArrayList<Long> fruitList = new ArrayList<>();


        for (String i : fruits) {
            fruitList.add(1L);
            System.out.println(i);
        }
        System.out.println(Arrays.asList(fruits));
        System.out.println(fruitList.toArray()[2]);
        System.out.println(Arrays.toString(fruits));
    }

}
