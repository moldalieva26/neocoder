package part2;

import java.util.Scanner;

public class Translation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();

        String reversedStr2 = "";

        for(int i = str2.length() - 1; i >= 0; i--){
            reversedStr2 += str2.charAt(i) +"";
        }
        //System.out.println(reversedStr2);
        if(str1.equals(reversedStr2)){
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
