package part2;

import java.util.Scanner;
public class HQ9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String strInput = scanner.nextLine();
        if(strInput.contains("H") || strInput.contains("Q") || strInput.contains("9")){
            System.out.println("YES");
        } else{
            System.out.println("NO");
        }
    }
}
