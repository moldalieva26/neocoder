package part1;

import java.util.Scanner;

public class Word {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        int lengthUpperCase = 0;
        int lengthLowerCase = 0;
        int wordLength = word.length();

        for (int i = 0; i < wordLength; i++){
            if(Character.isLowerCase(word.charAt(i))){
                lengthLowerCase++;
            } else if(Character.isUpperCase(word.charAt(i))){
                lengthUpperCase++;
            }
        }
        String result = "";

        if(lengthLowerCase>=lengthUpperCase){
            result = word.toLowerCase();
        } else{
            result = word.toUpperCase();
        }
        System.out.println(result);

    }
}
