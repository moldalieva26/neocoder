package cybertekQs;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine(); //begin
        String result = "";
        for(int i=(str.length()-1); i>=0; i--){
            result += str.charAt(i) +"";
        }
        System.out.println(result);

        /////////////////////////////
        String reversedStr = new StringBuilder(str).reverse().toString();
        System.out.println(reversedStr);


    }
}
