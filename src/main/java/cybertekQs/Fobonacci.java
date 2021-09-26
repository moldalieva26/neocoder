package cybertekQs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Fobonacci {
    public static void main(String[] args) {

        int[] arr = {5,5,5,6,7,8};
        Arrays.sort(arr);
        int maxNum = arr[arr.length-1];
        System.out.println(maxNum);

        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(2);
        list.add(4);
        list.add(7);

        Collections.sort(list);
        int maxNum1 = list.get(list.size()-1);
        System.out.println(maxNum1);


    }
}
