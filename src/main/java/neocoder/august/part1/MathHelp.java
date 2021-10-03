package neocoder.august.part1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class MathHelp {
    public static void main(String[] args) {
        MathHelp.reorganizeStr();
    }
    public static void reorganizeStr(){
        Scanner scanner = new Scanner(System.in);
        String originalStr = scanner.nextLine();

        ArrayList<Character> strList = new ArrayList<Character>();
        ArrayList<Character> sortedList = new ArrayList<Character>();
        int maxNum = 0;
        for(char c: originalStr.toCharArray()){
            if(c!='+') {
                strList.add(c);
            }
        }
        Collections.sort(strList); // write your own sort
        String result = "";
        for(int i=0; i<strList.size(); i++){
            if(i==0){
                result = ""+ strList.get(i);
            } else {
            result = result + "+" + strList.get(i);
            }
        }
        System.out.println(result);
    }
}
