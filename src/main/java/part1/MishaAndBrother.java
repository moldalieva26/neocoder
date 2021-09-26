package part1;

import java.util.Scanner;

public class MishaAndBrother {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int limak = scanner.nextInt();
        int bob = scanner.nextInt();
        int year = 0;


        while(limak <= bob){
            limak = limak * 3;
            bob = bob * 2;
            year++;
        }
        System.out.println(year);

    }
}
