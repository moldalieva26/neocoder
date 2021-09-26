package cybertekQs;

public class Factorial {
    public static void main(String[] args) {
        int num = 5;
        int factorialSum = 1;

        for(int i = 1; i <= num; i++){
            factorialSum = factorialSum * i;
            System.out.println(factorialSum);
        }
        System.out.println(factorialSum);

    }
}
