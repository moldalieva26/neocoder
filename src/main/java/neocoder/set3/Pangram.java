package neocoder.set3;

//accepted
import java.util.Locale;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Pangram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        scanner.nextLine();
        String word = scanner.nextLine().toLowerCase(Locale.ROOT);

        char[] chars = word.toCharArray();
        Set<Character> treeSet = new TreeSet<>();
        //treeSet.addAll(chars);

        for(int i=0; i<chars.length; i++){
            treeSet.add(chars[i]);
        }

        if(length < 26){
            System.out.println("NO");
        } else {
            if(26 == treeSet.size()){
                System.out.println("YES");
            } else{
                System.out.println("NO");
            }

        }

    }
}
