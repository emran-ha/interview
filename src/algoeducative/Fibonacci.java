package algoeducative;

import java.util.Arrays;

class Fibonacci {
     static int feb(int n){
         if(n <= 1){
             return n;
         }
         return feb(n - 1) + feb(n - 2);
     }
     static void fibonacci(int n){
         int num1 = 0, num2 = 1;
         int counter = 0;
         while(counter < n){
             System.out.print(num1+" ");
             int num3 = num1 + num2;
             num1 = num2;
             num2 = num3;
             counter++ ;
         }

     }

     static int fibonacciMem(int n, int[] table){
         if(n <= 1){
             return n;
         }
         if(table[n] != -1){
             return table[n];
         }
         table[n] = fibonacciMem(n - 1, table) + fibonacciMem(n - 2, table);
         return table[n];
     }

     static int fibbonacciTable(int n, int[] table){
        table[0] = 0;
        table[1] = 1;
        for (int i = 2; i < n + 1; i++){
            table[i] = table[i - 1] + table[i - 2];
        }
        return table[n];
     }

     public static void main(String[] args) {
         System.out.println(feb(10));
         fibonacci(11);

         int n = 7;
         int[] table = new int[n+1];
         for(int i = 0; i < n + 1; i++){
             table[i] = -1;
         }
         System.out.println();
         System.out.println(fibonacciMem(n, table));
         System.out.println(fibbonacciTable(n, table));
     }
}
