package part2;

import java.util.ArrayList;
import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        BinarySearch.countElementsInArray();
    }

    public static void countElementsInArray(){
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> arrayList1 = new ArrayList<>();
        ArrayList<Integer> arrayList2 = new ArrayList<>();

        int arrlength1 = scanner.nextInt();
        int arrlength2 = scanner.nextInt();

        for(int i = 0; i < arrlength1; i++){
            arrayList1.add(scanner.nextInt());
        }

        for(int i = 0; i < arrlength2; i++){
            arrayList2.add(scanner.nextInt());
        }

        for(int i = 0; i < arrlength2; i++){
            int count = 0;
            for (int n = 0; n < arrlength1; n++){
                if(arrayList2.get(i) == arrayList1.get(n)){
                    count++;
                } else{
                }
            }
            if(count > 0){
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
