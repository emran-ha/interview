package algoeducative;

class MinimumChangeCount {
 static Integer[][] lookupTable;
 public static int countChangeRec(int denoms[], int denomsLength, int amount) {
  if (amount == 0)
   return 1;
  if (amount < 0 || denomsLength == 0)
   return 0;
  if (lookupTable[denomsLength - 1][amount] != null)
   return lookupTable[denomsLength - 1][amount];

  lookupTable[denomsLength - 1][amount] =
          countChangeRec(denoms, denomsLength - 1, amount) +
                  countChangeRec(denoms, denomsLength, amount - denoms[denomsLength - 1]);
  return lookupTable[denomsLength - 1][amount];
 }

 public static int countChange(int denoms[], int denomsLength, int amount) {

  lookupTable = new Integer[denomsLength][];
  for (int i = 0; i < denomsLength; i++) {
   lookupTable[i] = new Integer[amount + 1];
  }
  return countChangeRec(denoms, denomsLength, amount);
 }
 public static void main(String args[]) {
  int[] denoms = {25, 10, 5, 1};
  System.out.println(countChange(denoms, 4, 10));
  for (int i = 0; i < lookupTable.length; i++){
   for (int j = 0; j < lookupTable[i].length; j++){
    System.out.print(" " + lookupTable[i][j]);
   }
   System.out.println();
  }
 }
}