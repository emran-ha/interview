package problemsolving.infotech;

class FactorizationForm {
    static boolean isPrime(int n){
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    static void Factors(int n) {
        while (n > 1) {
            if (isPrime(n)) {
                System.out.println(n);
                break;
            } else {
                if (n % 2 == 0) {
                    n = n / 2;
                    System.out.println(2);
                } else if(n % 3 == 0) {
                    n = n / 3;
                    System.out.println(3);
                } else if (n % 5 == 0) {
                    n = n / 5;
                } else {
                    n = n / 7;
                    System.out.println(7);
                }
            }

        }
    }

    public static void main(String[] args) {
        Factors(49);
    }
}
