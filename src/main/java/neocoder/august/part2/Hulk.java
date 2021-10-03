package neocoder.august.part2;

import java.util.Scanner;

public class Hulk {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        String layer1 = "I hate";
        String layer2 = "I love";
        String resultStr = "I hate";

        for(int i = 2; i <= num; i++){
             if(i%2!=0){
                 resultStr = resultStr + " that " + layer1;

            } else if(i%2==0){
                resultStr = resultStr + " that " + layer2;
            }
        }
        System.out.println(resultStr + " it");
    }
}
