package recursive;

class GridPath {
    static int grid(int n, int m){
        if(n == 1 || m == 1){
            return 1;
        }
        return grid(n - 1, m) + grid(n, m - 1);
    }

    public static void main(String[] args) {
        System.out.println(grid(3, 3));
    }
}
