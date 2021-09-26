package part1;

import java.util.Scanner;

public class SoldierBanana {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int costFirstBanana = scanner.nextInt();
        int soldierBudget =  scanner.nextInt();
        int numBananas = scanner.nextInt();

        int  totalCost = 0;

        for(int i = 1; i <= numBananas; i++){
            totalCost = totalCost + (costFirstBanana * i);
        }

        int amountToBorrow  = 0;

        if (soldierBudget < totalCost) {
            amountToBorrow = totalCost - soldierBudget;
        }
        System.out.println(amountToBorrow);


    }
}
