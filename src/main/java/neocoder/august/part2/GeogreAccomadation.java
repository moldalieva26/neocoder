package neocoder.august.part2;

import java.util.Scanner;

public class GeogreAccomadation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int roomNum = scanner.nextInt();

        int count = 0;
        for(int i = 0; i < roomNum; i++){
            int peopleNum = scanner.nextInt();
            int roomCapacity = scanner.nextInt();
            int freeSpace = roomCapacity - peopleNum;
            if(freeSpace>=2){
                count++;
            }

        }
        System.out.println(count);
    }

}
