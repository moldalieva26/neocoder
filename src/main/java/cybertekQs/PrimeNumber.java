package cybertekQs;

public class PrimeNumber {
    public static void main(String[] args) {
        int num = 13;
        boolean isPrime = true;
        for (int i = 2; i <= num / 2; ++i ){
            if (num % i == 0){
                isPrime = false;
                break;
            } else {
                isPrime = true;
            }

        }


    }

}
