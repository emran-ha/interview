package algoeducative;

class SearchInRotated {
    static int search(int arr[], int left, int right, int n){
        int mid = (left + right) / 2;
        if(n == arr[mid]){
            System.out.println("mid "+ mid+" "+arr[mid]);
            return mid;
        }

        if(right < left)
            return -1;

        if(arr[left] < arr[mid]){
            if(n >= arr[left] && n < arr[mid]){
                return search(arr, left, mid - 1, n);
            }else {
                return search(arr, mid + 1, right, n);
            }
        }else if(arr[mid] < arr[left]){
            if(n > arr[mid] && n <= arr[right]){
               return search(arr, mid + 1, right, n );
            }else{
               return search(arr, left, mid - 1, n);
            }
        }else if(arr[left] == arr[mid]){
            if(arr[mid] != arr[right]){
                return search(arr, mid + 1, right, n);
            }else{
                int result = search(arr, left, mid - 1, n);
                if(result == -1)
                    return search(arr, mid + 1, right, n);
                    else
                    return result;
            }

        }

          return -1;
    }
    public static void main(String[] args) {
        int[] arr = {1,3};
        int n = search(arr, 0, 1, 0);
        System.out.println(n);
    }
}
