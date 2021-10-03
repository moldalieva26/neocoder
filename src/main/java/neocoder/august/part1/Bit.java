package neocoder.august.part1;

import java.util.Scanner;

public class Bit {
    public static void main(String[] args) {
        Bit.findTotalBits();
    }

    public static void findTotalBits(){
        Scanner scanner = new Scanner(System.in);
        int inputNum = scanner.nextInt();
        int totalBits = 0;
        for(int i = 0; i<=inputNum; i++){
           String inputStr = scanner.nextLine();
            if(inputStr.equals("++X") || inputStr.equals("X++")) {
                totalBits = totalBits + 1;
            } else if(inputStr.equals("--X") || inputStr.equals("X--")){
                totalBits = totalBits - 1;
            }
        }
        System.out.println(totalBits);
    }
}
