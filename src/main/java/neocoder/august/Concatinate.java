package neocoder.august;

import java.util.*;

public class Concatinate {
    public static void main(String[] args) {
          /*
        string a, b;
       for (i = 1 ... a.length)
       Прибавить к ответу b.length - b.count(a[i])
       Вывод ans
       Но там нужно ещё кое-какие кейсы учитывать.
       Например для первой буквы слова а, отнимать b.count(a[i]) не нужно
         */
        Scanner scanner = new Scanner(System.in);
        String word1 = scanner.nextLine();
        String word2 = scanner.nextLine();


        //Неправильный ответ на тесте 4
        long count = 0;
        long answer = 0;
        for(int i=0; i<word2.length(); i++){
            for(int n=0; n<word1.length(); n++){
                if((word2.charAt(i)+"").equals(word1.charAt(n)+"")){
                    count++;

                }

            }
        }

        answer = word1.length()*word2.length()-count;

        //System.out.println(count + "----------");
        System.out.println(answer);


        /*

        long count = 0;
        long answer = 0;
        for(int n=1; n<word1.length()+1; n++){
            answer = answer + word1.substring(0,n).length()+word2.length(); // hren' kakaya ta
            System.out.println(word1.substring(0,n));
            System.out.println(answer);
            if(word2.contains(word1.charAt(n)+"")){
                count++;
            }

        }

         */


    }
    // Превышено ограничение памяти на тесте 14
    public static void concatinateStrs(){

        Scanner scanner = new Scanner(System.in);
        String word1 = scanner.nextLine();
        String word2 = scanner.nextLine();
        String[] arr = new String[word1.length()*word2.length()];

        // chto esli ya srazu v set budu pihat'?
        // long ispolzovat'?
        int index = 0;
        for(int i=word2.length(); i>0 ; i--){
            for(int n=1; n<word1.length()+1; n++){
                arr[index] = word1.substring(0,n).concat(word2.substring(word2.length()-i));
                index++;
            }
        }
        // System.out.println(Arrays.toString(arr));

        // now find uniques only
        Set<String> hashSet = new HashSet<String>(Arrays.asList(arr));
        //System.out.println(hashSet);
        System.out.println(hashSet.size());





    }
}
