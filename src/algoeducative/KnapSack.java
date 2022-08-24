package algoeducative;


import java.util.Arrays;

class KnapSack {
    static int knapsack(int[] profit, int profitLength, int[] weight, int weightLength, int capacity, int current){
        if(current >= profitLength || capacity <= 0 ){
            return 0;
        }

        int profit1 = 0;
        if(weight[current] <= capacity ){
            profit1 = profit[current] + knapsack(profit, profitLength, weight, weightLength,
                    capacity - weight[current], current + 1);
        }
        int profit2 = knapsack(profit, profitLength, weight, profitLength, capacity, current + 1);
        return Math.max(profit1, profit2);
    }

    static int knapsackTable(int[][] table, int[] profit, int profitLength , int[] weight, int weightLength,
                             int capacity, int current){
        if(current >= profitLength || capacity <= 0){
            return 0;
        }

        if(table[current][capacity] != 0){
            return table[current][capacity];
        }
        int profit1 = 0;
        if(weight[current] <= capacity){
            profit1 = profit[current] + knapsackTable(table, profit, profitLength, weight,
                    weightLength, capacity - weight[current], current + 1);
        }
        int profit2 = knapsackTable(table, profit, profitLength, weight,
                weightLength, capacity, current + 1);
        table[current][capacity] = Math.max(profit1, profit2);
        return table[current][capacity];
    }

    static int profitTable(int[] p, int pl, int[] w, int wl, int capacity){
        int[][] table = new int[pl][];
        for(int i = 0; i < pl; i++){
            table[i] = new int[capacity + 1];
            for(int j = 0; j < capacity + 1; j++){
                table[i][j] = 0;
            }
        }
        return knapsackTable(table, p, pl, w, wl, capacity, 0);
    }

    public static void main(String[] args) {
        int profits[] = {1, 6, 10, 16}; // The values of the jewelry
        int weights[] = {1, 2, 3, 5}; // The weight of each
        System.out.println("Total knapsack profit ---> " + knapsack(profits, 4, weights, 4,  7, 0));
        System.out.println("Total knapsack profit ---> " + knapsack(profits, 4, weights, 4, 6, 0));

        System.out.println("Total knapsack profit ---> " + profitTable(profits, 4, weights, 4, 6));
    }
}
