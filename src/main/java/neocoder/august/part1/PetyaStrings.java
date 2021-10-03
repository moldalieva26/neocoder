package neocoder.august.part1;

import java.util.Scanner;
public class PetyaStrings {
    public static void main(String[] args) {
        PetyaStrings.findDifference();
    }
    public static void findDifference(){
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();
        int diff = 0;

        if(str1.compareToIgnoreCase(str2) ==0){
            diff = 0;
        } else if(str1.compareToIgnoreCase(str2)<0) {
            diff = -1;
        } else if(str1.compareToIgnoreCase(str2)>0){
            diff = 1;
        }
        System.out.println(diff);


    }
}
