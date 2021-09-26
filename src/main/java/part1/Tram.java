package part1;
//https://gist.github.com/Jack-Saleem/fe77a17aef65f2fee2a1 solution is here
import java.util.Scanner;

public class Tram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tramStopNum = scanner.nextInt();
        int[] b = new int[2*tramStopNum];
        int[] c = new int[2*tramStopNum];


        for(int i=0;i<b.length;i++)
            b[i]=scanner.nextInt();
        for(int i=0;i<b.length-3;i+=2) {
            if(i==0)
                c[i]=b[i+1];
            else
                c[i]=Math.abs(c[i-2]-b[i])+b[i+1];
        }
        for(int i=2;i<b.length-3;i+=2) {
            if(c[0]<c[i])
                c[0]=c[i];
        }
        System.out.println(c[0]);

    }
}
