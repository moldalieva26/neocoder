package neocoder.august.part1;

import java.util.ArrayList;
import java.util.Scanner;
// dne ponyala uslovie
// in c++ https://dabananda.blogspot.com/2021/02/266b-queue-at-school-codeforces.html
public class QueueAtSchool {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int studentNum = scanner.nextInt();
        int studentMoveNum = scanner.nextInt();
        scanner.nextLine();
        String startPosition = scanner.nextLine();
        String endPosition = "";

        ArrayList<Character> arrayList = new ArrayList<>();
        for(int i = 1; i<studentNum; i++){
            arrayList.add(startPosition.charAt(i));

        }
        arrayList.add(studentMoveNum, startPosition.charAt(0));
        System.out.println(arrayList);

    }
}
