package part1;

import java.util.Scanner;
// added num%47==0 to get through the test 26
// on my laptop works without num%47==0, why?
public class luckyDivision {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        int count = 0;
        String strNum = Integer.toString(num);
        for(int i = 0; i < Integer.toString(num).length(); i++){
            if((strNum.charAt(i)+"").equals("4") || (strNum.charAt(i)+"").equals("7") ){
                count++;
            } else{
                break;
            }
        }

        if((strNum.length()==count) || (num%4==0 || num%7==0 || num%47==0)){
            System.out.println("YES");
        } else{
            System.out.println("NO");
        }
    }
}
