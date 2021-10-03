package neocoder.set3;

import java.util.Scanner;
//accepted
public class VasyaSocks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int red = scanner.nextInt();
        int blue = scanner.nextInt();

        int onTrendDays = 0;
        int outOfTrendDays = 0;

        if(red>blue){
            onTrendDays = blue;
            outOfTrendDays = (red - blue) / 2;
        } else {
            onTrendDays = red;
            outOfTrendDays = (blue - red) / 2;
        }

        System.out.println(onTrendDays +" " + outOfTrendDays);
    }
}
