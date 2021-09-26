package part1;

import java.util.Scanner;

public class BoyOrGirl {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        String distinctChars = "";

        // remove duplicate chars -> count chars
        for(int i = 0; i < name.length(); i++){
            if(!distinctChars.contains(name.charAt(i)+"")){
                distinctChars += name.charAt(i)+"";
            }
        }
        //System.out.println(distinctChars);

        if(distinctChars.length()%2==0){
            System.out.println("CHAT WITH HER!");
        } else{
            System.out.println("IGNORE HIM!");
        }
    }
}
