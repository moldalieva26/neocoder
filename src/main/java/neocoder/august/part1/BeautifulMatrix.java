package neocoder.august.part1;
// not my solution https://gist.github.com/Jack-Saleem/ab94f1824591411f43cc
import java.util.Scanner;

public class BeautifulMatrix {

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int[][] array=new int[6][6];

        for(int i=1;i<=5;i++) {
            for(int j=1;j<=5;j++)
                array[i][j]=scanner.nextInt();
        }
        for(int i=1;i<=5;i++) {
            for(int j=1;j<=5;j++)
            {
                if(array[i][j]==1)
                    System.out.println(Math.abs(3-i)+Math.abs(3-j));
            }
        }
    }
}
