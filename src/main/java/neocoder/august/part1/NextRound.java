package neocoder.august.part1;

import java.util.ArrayList;
import java.util.Scanner;

public class NextRound {
    public static void main(String[] args){
        NextRound.findNextRoundAdvancersNum();
    }

    public static void findNextRoundAdvancersNum(){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();

        int numNextRounders = 0;

        ArrayList<Integer> list = new ArrayList<>();
        for(int i =0; i<n; i++){
            int score = scanner.nextInt();
            list.add(score);
        }
        int placeAdvance = list.get(k-1);
        //System.out.println("Place: " + placeAdvance);


        for(int i =0; i<list.size(); i++){
            int score = list.get(i);
            if(score>=placeAdvance && score>0){
                numNextRounders++;
            }
        }
        System.out.println(numNextRounders);



    }
}
