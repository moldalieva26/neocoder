package neocoder.august.part2;

import java.util.Scanner;

public class SearchEasyProblem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int peopleNum = scanner.nextInt();

        int sum = 0;
        for(int i = 0; i < peopleNum; i++){
            int answer = scanner.nextInt();
            sum += answer;
            if(answer == 1){
                System.out.println("HARD");
                break;
            }
        }

        if(sum==0){
            System.out.println("EASY");
        }
    }
}
