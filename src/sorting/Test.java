package sorting;

class Test {

    int sum(int n){

        if(n == 0){
            return 0;
        }
        return n + sum(n - 1);
    }
    int sum(int start, int end){
        if(start > end){
            return 0;
        }
        return start + sum(start + 1, end);
    }
    public static void main(String[] args) {
        Test test = new Test();
        System.out.println(test.sum(10));
        System.out.println(test.sum(5, 10));
    }
}

