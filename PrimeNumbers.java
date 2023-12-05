public class PrimeNumbers {
//    Tests for prime numbers

    public static void main(String[] args) {
        int num = 2;
        boolean isPrime;

        if(num < 2) isPrime = true; else isPrime = false;

        for(int i = 2; i <= num/i; i++){
            if((num % i) == 0){
                isPrime = false;
                break;
            }
        }
        if (isPrime) System.out.println("Prime");
        else System.out.println("Not Prime");

    }
}
