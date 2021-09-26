package part1;

import java.util.Scanner;
// SOLVE IT AGAIN
public class TheaterSquare {
    public static void main(String[] args){
      //  TheaterSquare.findMinNum();

        Scanner scanner = new Scanner(System.in);
        long  n=scanner.nextInt();
        long m=scanner.nextInt();
        long a =scanner.nextInt();
        long c=0,sumTotal2=0, sumTotal1=0;
        if(m%a==0) {
            sumTotal1=(m/a);
        }
        else  {
            sumTotal1=(m/a)+1;
        }
        if(n%a==0) {
            sumTotal2=(n/a);
        }
        else  {
            sumTotal2=(n/a)+1;
        }
        c=sumTotal1*sumTotal2;
        System.out.println(c);
    }

// WRONG
    public static void findMinNum(){
        Scanner scan = new Scanner(System.in);
        long n = scan.nextInt();
        long m = scan.nextInt();
        long a = scan.nextInt();
        long numFlagstones = 0;


        if((a>n && a>m) || (a==n && a==m)){
            numFlagstones = 1;
            System.out.println(numFlagstones);

        } else if(a<n && a<m){
            if(n%a!=0 && m%a!=0) {
                numFlagstones = ((n / a) + 1) * ((m / a) + 1);
            } else {
                numFlagstones = (n/a) * (m/a);
            }
            System.out.println(numFlagstones); // ok

        } else if(a<n && a>m){
            if(n%a!=0) {
                numFlagstones = ((n / a) + 1);
            } else {
                numFlagstones = (n/a);
            }
            System.out.println(numFlagstones);

        } else if(a>n && a<m){
            if(m%a!=0) {
                numFlagstones = ((m / a) + 1);
            } else {
                numFlagstones = (m/a);
            }
            System.out.println(numFlagstones);

        }
    }
}
