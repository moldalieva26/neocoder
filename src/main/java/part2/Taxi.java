package part2;

import java.util.Scanner;

public class Taxi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long groupNum = scanner.nextLong();

        long numTaxiNeeded = 0;

        for(long i = 0; i<groupNum; i++){
            int sum  = 0;
            int kidsNumGroup = scanner.nextInt();
            if(kidsNumGroup == 4){
                numTaxiNeeded ++;
            } else if(kidsNumGroup == 3){
                //sum = sum + kidsNumGroup; //

            }



        }

    }
}
