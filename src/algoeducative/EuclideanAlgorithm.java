package algoeducative;

class EuclideanAlgorithm {
    public static int GCD(int a, int b) 
    {
        // your awesome code goes here!
        
        int temp;
        if (a < b){
            temp = a;
            a = b;
            b = temp;
        }
        if(b == 0){
            return a;
        }
        while(a % b != 0){
            a = a % b;
            temp = a;
            a = b;
            b = temp;
            if (b == 0){
                break;
            }
        }
        return b;
    }

    public static void main(String[] args) {

    }
} 