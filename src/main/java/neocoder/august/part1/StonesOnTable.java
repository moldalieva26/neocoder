package neocoder.august.part1;

import java.util.Scanner;

public class StonesOnTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        scanner.nextLine();
        String color = scanner.nextLine();

        int steps = 0;
        for(int i = 0; i < num-1; i++){
            if(color.substring(i, i+1).equals(color.substring(i+1, i+2))){
                steps ++;
            }
        }

        System.out.println(steps);

    }
}
