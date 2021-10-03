package neocoder.august.part2;

import java.util.ArrayList;
import java.util.Scanner;
// ogranichenie vo vremeni
public class Arrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int arr1Length = scanner.nextInt();
        int[] arr1 = new int[arr1Length];

        for(int i = 0; i < arr1Length; i++){
            //arr1. how to add?
        }


    }
    public static void countElementsInArray(){
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> arrayList1 = new ArrayList<>();
        ArrayList<Integer> arrayList2 = new ArrayList<>();

        int arrlength1 = scanner.nextInt();
        for(int i = 0; i < arrlength1; i++){
            arrayList1.add(scanner.nextInt());
        }

        int arrlength2 = scanner.nextInt();
        for(int i = 0; i < arrlength2; i++){
            arrayList2.add(scanner.nextInt());
        }

        for(int i = 0; i < arrlength2; i++){ // [0, 1, 2, 3]
            int count = 0;
            for (int n = 0; n < arrlength1; n++){ // [1, 2, 1]
                if(arrayList2.get(i) == arrayList1.get(n)){
                    count++;
                } else{
                }
            }
            System.out.println(count);
        }
    }
}
