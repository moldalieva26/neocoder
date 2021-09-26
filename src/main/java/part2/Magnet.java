package part2;

import java.util.Scanner;

public class Magnet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int magnetNum = scanner.nextInt(); // ? long
        scanner.nextLine();

        String[] array = new String[magnetNum];

        long count = 1;
        for(int i=0; i<magnetNum; i++){
            array[i] = scanner.nextLine();;
        }
        for(int i=0; i<magnetNum-1; i++){
            if(!array[i].equals(array[i+1])){
                count++;
            }

        }
        System.out.println(count);


    }
}
