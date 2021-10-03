package neocoder;

import java.util.Scanner;
// нельзя класть большее кольцо на меньшее.
// incorrect, start again from scratch
public class HanoiBashni {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();


    }
    public static void findSequince(){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (n == 1 || n < 1) {
            System.out.print("1" + " 1 " + "3");
        } else {

            int[] diskNums = new int[n];
            int num = 1;
            for (int i = 0; i < n; i++) {
                diskNums[i] = num;
                num++;
            }
            int a, b, c;
            for (int i = 0; i < (n - 1); i++) {
                a = diskNums[i];
                b = 1;
                c = 2;
                System.out.print(a + " ");
                System.out.print(b + " ");
                System.out.print(c + " ");
                System.out.println();
            }

            a = diskNums[n - 1];
            System.out.print(a + " 1 " + "3");
            System.out.println();

            for (int i = (n - 2); i >= 0; i--) {
                a = diskNums[i];
                b = 2;
                c = 3;
                System.out.print(a + " ");
                System.out.print(b + " ");
                System.out.print(c + " ");
                System.out.println();
            }
        }
    }
}
