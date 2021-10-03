package neocoder.august.part1;

import java.util.Scanner;
//  i don't know why wrong
public class NearlyLuckyNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long num = scanner.nextLong();

        int count = 0;
        String strNum = String.valueOf(num); //Integer.toString(num);
        //System.out.println(strNum);
        for(int i = 0; i < String.valueOf(num).length(); i++){
            if((strNum.charAt(i)+"").equals("4") || (strNum.charAt(i)+"").equals("7") ){
                count++;
            }
        }

        if((count==4 || count==7 || count==47 || count==44 || count==74)){
            System.out.println("YES");
        } else{
            System.out.println("NO");
        }
    }

}
