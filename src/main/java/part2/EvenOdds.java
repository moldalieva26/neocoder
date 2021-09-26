package part2;

import java.util.ArrayList;
import java.util.Scanner;
// Runtime error on test 8
// solution https://gist.github.com/Jack-Saleem/054fb7f9987df8107838
public class EvenOdds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long num = scanner.nextLong();
        int position = scanner.nextInt();

        ArrayList<Long> list = new ArrayList<>();


        if(position<=num/2){
            for (long i = 1; i <= num; i++){
                if(i%2!=0){
                    list.add(i);
                }
            }
            System.out.println(list);
            System.out.println(list.get((position-1)));


        } else if(position>num/2){
            for (long i = 1; i <= num; i++){ //?
                if(i%2==0){
                    list.add(i);
                }
            }

            System.out.println(list);
            double newPosition =((double)position/2);
            System.out.println("new position " + newPosition);
            if(newPosition%1==0){ // is not celoe
               // System.out.println(list.get(newPosition-3.0) + " if"); // it rounds up

            } else{
               // System.out.println(list.get(newPosition - 2)); // it rounds up // cating problem

            }

        }

        //  FIND OTHER MATH FORMULA THAT WILL SOLVE WITHOUT LOOP
    }

    public static void findNumAtK(){
        Scanner scanner = new Scanner(System.in);
        long num = scanner.nextLong();
        int position = scanner.nextInt();

        ArrayList<Long> list = new ArrayList<>();

        for (long i = 1; i <= num; i++){
            if(i%2!=0){
                list.add(i);
            }
        }
        //System.out.println(list);

        //  FIND OTHER MATH FORMULA THAT WILL SOLVE WITHOUT LOOP
        for (long i = 1; i <= num; i++){
            if(i%2==0){
                list.add(i);
            }
        }
        //System.out.println(list);
        System.out.println(list.get((position-1)));

    }
}
