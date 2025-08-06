
public class PrimeChecker {

    int number;

    
    public PrimeChecker(int number) {
        this.number = number;
    }

    
    public boolean isPrime() {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        PrimeChecker checker = new PrimeChecker(17); 

        if (checker.isPrime()) {
            System.out.println(checker.number + " is a prime number.");
        } else {
            System.out.println(checker.number + " is not a prime number.");
        }
    }
}
