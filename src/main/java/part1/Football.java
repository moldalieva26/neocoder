package part1;

import java.util.Scanner;

public class Football {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String teams = scanner.nextLine();


        if(teams.contains("1111111") || teams.contains("0000000")){
            System.out.println("YES");
        } else{
            System.out.println("NO");
        }

    }

/*
    int count = 0;
        if (teams.length() >= 7) {
        for (int i = 0; i < (teams.length()-6); i++) {
            for (int n = 1; n < 7; n++) { // incorrect logic?
                if((teams.charAt(i)+"").equals(teams.charAt(n)+"")){
                    count++;

                }
            }
        }
    }
        if(count==7){ //?
        System.out.println("YES");
    } else {
        System.out.println("NO");
    }
*/




}
