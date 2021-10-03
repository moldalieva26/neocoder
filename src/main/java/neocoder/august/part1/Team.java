package neocoder.august.part1;

import java.util.Scanner;

public class Team {
    public static void main (String[] args){
        Team.findNumProblemsSolved();
    }

    public static void findNumProblemsSolved(){
        Scanner scanner = new Scanner(System.in);
        int totalNumProblems = scanner.nextInt();

        int numProblemsToSolve = 0;
        for(int i = 0; i<totalNumProblems; i++){
            int petya = scanner.nextInt();
            int vasya = scanner.nextInt();
            int tonya = scanner.nextInt();

            int sum = petya + vasya + tonya;

            if(sum>=2){
                numProblemsToSolve = numProblemsToSolve + 1;
            }
        }
        System.out.println(numProblemsToSolve);
    }
}
