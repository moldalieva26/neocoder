package part1;

import java.util.Scanner;

public class StringTask {
    public static void main(String[] args) {
        StringTask.modifyString();

    }
    public static void modifyString(){
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();


        String resultStr  = "";
        for(int i = 0; i < str.length(); i++){ // try with array
            if((str.charAt(i)+"").equalsIgnoreCase("A") ||
                    (str.charAt(i)+"").equalsIgnoreCase("O") ||
                    (str.charAt(i)+"").equalsIgnoreCase("Y") ||
                    (str.charAt(i)+"").equalsIgnoreCase("U") ||
                    (str.charAt(i)+"").equalsIgnoreCase("E") ||
                    (str.charAt(i)+"").equalsIgnoreCase("I")){

            resultStr = resultStr + "";
            } else {
                resultStr = resultStr + "." + str.charAt(i);
            }
        }
        String finalString = resultStr.toLowerCase();
        System.out.println(finalString);

    }

}
