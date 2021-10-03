package neocoder.set3;

import java.util.Scanner;

public class FoxSnake {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        String strH = "";
        String strDot = "";

        for(int i=0; i<m; i++){
            strH += "#";
            strDot += ".";

        }
        String strDotNew = strDot.substring(0, (m-1)) + "#";
        String dotStr = "#" + strDot.substring(0, (m-1)) ;

        for(int i=1; i<=n; i++){
            if(i%2==0){
                if(i%4==0){
                    System.out.println(dotStr);
                } else{
                    System.out.println(strDotNew);
                }
            } else {
                System.out.println(strH);
            }
        }

    }
}
