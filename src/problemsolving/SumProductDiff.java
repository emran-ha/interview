package problemsolving;

class SumProductDiff {

    int product(int n){
        int prod = 1;
        while(n > 0) {
            prod = prod * (n % 10);
            n = n / 10;
        }
        return prod;
    }

    int sum(int n){
        int s = 0;
        while(n > 0){
            s = s + ( n % 10 );
            n = n / 10;
        }
        return s;
    }

    public static void main(String[] args) {
        SumProductDiff sumProductDiff = new SumProductDiff();
        int diff = sumProductDiff.product(221) - sumProductDiff.sum(221);
        System.out.println(diff);
    }
}
