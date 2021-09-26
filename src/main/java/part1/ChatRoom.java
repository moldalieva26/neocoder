package part1;
import java.util.Scanner;
public class ChatRoom {
    public static void main(String[] args) {
        ChatRoom.chat();

    }

    public static void chat(){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        Character[] hello = {'h', 'e', 'l', 'l', 'o'};
        int index = 0;
        char lookingFor = hello[index];
        for (char c : s.toCharArray()) {
            if (c == lookingFor && index == 4) {
                System.out.println("YES");
                return;
            } else if (c == lookingFor) {
                index++;
                lookingFor = hello[index];
            }
        }

        System.out.println("NO");
    }

    public static void chat2() {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();

        int count = 0;
        if(word.length()>=6){
            if(word.contains("h") && word.contains("e") && word.contains("l") && word.contains("o")){
                int n = 0;
                while (n < word.length()){
                    if((word.substring(n, n+1)).equals("l"+"")){
                        count++;
                    }
                    n++;
                }
                if(count>=2){
                    System.out.println("YES");
                } else{
                    System.out.println("NO");
                }
            }
        } else{
            System.out.println("NO");
        }
    }
    }


