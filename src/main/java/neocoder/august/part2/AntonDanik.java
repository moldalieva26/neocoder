package neocoder.august.part2;

import java.util.Scanner;

public class AntonDanik {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int gameNum = scanner.nextInt();
        scanner.nextLine();
        String outcome = scanner.nextLine();
        int scoreAnton = 0;
        int scoreDanik = 0;

        for(int i = 0; i < gameNum; i++){
            if((outcome.charAt(i)+"").equals("A")){
                scoreAnton++;
            } else{
                scoreDanik++;
            }
        }
        if(scoreAnton==scoreDanik){
            System.out.println("Friendship");
        } else if(scoreAnton>scoreDanik){
            System.out.println("Anton");
        }else {
            System.out.println("Danik");
        }
    }
}
