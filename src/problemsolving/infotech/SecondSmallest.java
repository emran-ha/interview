package problemsolving.infotech;

public class SecondSmallest {
    static int Second(int[] arr){
        for (int i = 0; i < 2; i++) {
            int minIndex = findMin(arr, i);
            int temp =  arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
        return arr[1];
    }

   static int findMin(int[] arr, int index){
        int minInd = index;
        for (int i = index; i < arr.length; i++){
            if (arr[i] < arr[minInd]){
                minInd = i;
            }
        }
        return minInd;
    }

    static int oneLoop(int[] arr) {
        int min1 = Integer.MAX_VALUE;
        int min2 = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min1) {
                min2 = min1;
                min1 = arr[i];
            } else if (arr[i] < min2) {
                min2 = arr[i];
            }
        }
        return min2;
    }

    public static void main(String[] args) {
        System.out.println(oneLoop(new int[]{4,5,2,1,0,-1}));
    }
}
