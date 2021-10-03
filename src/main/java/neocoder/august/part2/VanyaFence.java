package neocoder.august.part2;

import java.util.Scanner;

public class VanyaFence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long friendsNum = scanner.nextLong();
        long fenceHeight = scanner.nextLong();

        long count = 0;
        for(long i=0; i<friendsNum; i++){
            long personHeight = scanner.nextLong();
            if(personHeight>fenceHeight){
                count +=2;
            } else{
                count +=1;
            }

        }
        System.out.println(count);
    }
}
