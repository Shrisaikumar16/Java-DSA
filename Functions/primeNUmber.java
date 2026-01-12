public class primeNUmber {

    public static boolean primeNumber(int n) {
        boolean isPrime = true;
        if (n == 2 || n == 3) {
            return true;
        }
        for (int i=2; i<=Math.sqrt(n); i++) {
            if (n%i == 0) {
                isPrime = false;
            }
        }
        return isPrime;
    }


    public static void primeInRange(int n) {
        for (int i=2; i<=n; i++) {
            if(primeNumber(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    public static void main(String args[]) {
        //Check prime or not
        System.out.println(primeNumber(19));

        primeInRange(20);


    }
}
