package part1;

import java.util.Scanner;

public class WrongSubtraction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalNum = scanner.nextInt();
        int totalSteps = scanner.nextInt();

        while(totalSteps > 0) {
            int lastDigit = totalNum % 10;
            if (lastDigit == 0) {
                totalNum = totalNum / 10;
            } else{
                totalNum = totalNum -1;
            }
            totalSteps--;
        }

        System.out.println(totalNum);
    }

}
