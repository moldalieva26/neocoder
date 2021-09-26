package part1;

import java.util.Scanner;

public class DominoPiling {
    public static void main (String[] args){
        DominoPiling.findMaxDominoNum();
    }
    public static void findMaxDominoNum(){
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        int standardDomino = 2;
        int maxDominoNum = (m*n) / standardDomino;
        System.out.println(maxDominoNum);
    }
}
