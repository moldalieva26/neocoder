package neocoder.set3;

import java.util.Scanner;
// accepted
public class AntonMnogogranniki {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();


        int sum = 0;
        for(int i = 0; i < n; i++){
            String figure = scanner.nextLine();
            if(figure.equals("Tetrahedron")){
                sum += 4;
            } else if (figure.equals("Cube")){
                sum += 6;
            } else if(figure.equals("Octahedron")){
                sum += 8;
            } else if(figure.equals("Dodecahedron")){
                sum += 12;
            } else if(figure.equals("Icosahedron")){
                sum += 20;
            }
        }
        System.out.println(sum);


    }
}

