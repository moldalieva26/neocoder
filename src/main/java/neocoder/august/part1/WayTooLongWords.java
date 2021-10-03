package neocoder.august.part1;

import java.util.ArrayList;
import java.util.Scanner;

public class WayTooLongWords {
    public static void main(String[] args){
        WayTooLongWords.abbreviateWord();
    }
    public static void abbreviateWord(){
        Scanner scan = new Scanner(System.in);

        int numInput = scan.nextInt();
        scan.nextLine(); //

        ArrayList<String> list = new ArrayList<>();

        for(int i = 0; i<numInput; i++) {
            list.add(scan.nextLine());
        }

        for(int i = 0; i<numInput; i++){

            String word = list.get(i);
            if(word.length()<=10){
                word = word;
            }
            else{
                int charCount = word.length() - 2;
                word = word.charAt(0) + "" + charCount + word.charAt(word.length()-1) + "";
            }
            System.out.println(word);
        }
    }
}
