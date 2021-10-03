package neocoder.august.part2;

import java.util.Scanner;

// Time limit exceeded on test 3
// changed formula https://github.com/faarwa/Codeforces/blob/master/CalculatingFunction486A.java
public class CalculatingFunction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();

        long result =  0;


            if(n%2==0){
                result = n /2;
            } else {
                result = (-1) * (n/2 + 1);
            }

        System.out.println(result);
    }
}
