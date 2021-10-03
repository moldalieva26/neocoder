package neocoder.set3;

import java.util.Arrays;
import java.util.Scanner;
//accepted
public class FunnyJoke {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String guest = scanner.nextLine();
        String owner = scanner.nextLine();
        String mixedStr = scanner.nextLine();

        String str = guest.concat(owner);
        char[] chars1 = str.toCharArray();
        Arrays.sort(chars1);
        //System.out.println(Arrays.toString(chars1));

        char[] chars2 = mixedStr.toCharArray();
        Arrays.sort(chars2);
        //System.out.println(Arrays.toString(chars2));

        if(Arrays.equals(chars1, chars2)){
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
