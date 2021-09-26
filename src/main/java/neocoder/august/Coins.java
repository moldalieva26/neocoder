package neocoder.august;

import java.util.Arrays;
import java.util.Scanner;

public class Coins {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long totalSum = scanner.nextLong();
        int coinNum = scanner.nextInt();

        long[] coins = new long[coinNum*2];
        int count = 0;
        for(int i=0; i<coinNum; i++){
            coins[count] = scanner.nextLong();
            coins[count+1] = coins[count];
            count = count +2;
        }

        Arrays.sort(coins);
        long sumCoins = 0;
        for(int i=0; i<coins.length; i++){
            sumCoins = sumCoins +coins[i];
           // System.out.println(coins[i]);
        }

        if(sumCoins < totalSum){
            System.out.println("-1");
        }else if(sumCoins > totalSum){
            if(totalSum==coins[coins.length-1]){
                System.out.println("1"); // 1 coin -> print max face coin
            }///????

        } else{
            System.out.println("0");
        }



    }
}
