package part1;

import java.util.Scanner;

public class Elephant {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int friendsHouse = scanner.nextInt();

        int totalSteps = 0;
        //totalSteps = friendsHouse%5 == 0 ? friendsHouse/5 : friendsHouse/5 + 1; // shortest way

        if(friendsHouse%5==0){
            totalSteps = friendsHouse /5;
        } else{
            totalSteps = friendsHouse / 5 + 1; // logic is here
        }
            System.out.println(totalSteps);
    }
}
