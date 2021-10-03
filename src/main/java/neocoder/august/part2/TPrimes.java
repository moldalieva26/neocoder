package neocoder.august.part2;

import java.util.ArrayList;
import java.util.Scanner;
// ne pravil'no
public class TPrimes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double length = scanner.nextLong();
        ArrayList<Double> listRoots = new ArrayList<>();

        for(int i = 0; i < length; i++){ // int?
            double num = scanner.nextLong();
            listRoots.add(i, Math.sqrt(num));

        }
        System.out.println(listRoots);

        for(int i = 0; i < length; i++){
            int index = 0;
            if(listRoots.get(i) == 0 || listRoots.get(i) == 1){
                System.out.println(listRoots.get(i) + " NO");
            }
            else if(listRoots.get(i) % 2 == 0 ){ // ostatki ne pravil'no schitaet || listRoots.get(i) != 2.0
                System.out.println(listRoots.get(i) + ": NO");
                } else{
                    System.out.println(listRoots.get(i)  + " YES");
                }
            }
        }
}
