package problemsolving;

class TwoDArrayRestructure {
    static void find(int[] array, int[] position){
        int p = array[0] * (position[0] - 1) + position[1];
        System.out.println(array[p]);
    }

    public static void main(String[] args) {
        find(new int[]{3, 90,95, 100, 105, 110, 115},new int[]{2,1});
    }
}
