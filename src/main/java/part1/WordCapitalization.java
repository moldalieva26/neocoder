package part1;

import java.util.Scanner;

public class WordCapitalization {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        String capitalizedWord = Character.toUpperCase(word.charAt(0))+word.substring(1);
        System.out.println(capitalizedWord);

    }
}
