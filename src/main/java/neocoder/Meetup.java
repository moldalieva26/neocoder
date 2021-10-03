package neocoder;

import java.util.Arrays;
import java.util.Scanner;
// accepted
public class Meetup {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        long[] arr = new long[n];
        long[] arrResult = new long[n];

        if(n==3 || n==4){ //?
            System.out.println("-1");
        } else {
            int index = 0;
            for (int i = 0; i < n; i++) {
                arr[i] = scanner.nextLong();
                if (i % 2 == 0) {
                    arrResult[index] = arr[i];
                    index++;
                }

            }

            for (int i = 0; i < n; i++) {
                if (i % 2 != 0) {
                    arrResult[index] = arr[i];
                    index++;
                }
            }

            if(n % 2 == 0){
                long lastNum = arrResult[n-2];
                arrResult[n-2]=arrResult[n-1];
                arrResult[n-1] = lastNum;
            }

            for (int i = 0; i < n; i++){
                System.out.print(arrResult[i] +" ");
            }

        }

    }
}
