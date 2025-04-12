// Source code is decompiled from a .class file using FernFlower decompiler.
public class HashMapMain {
    public HashMapMain() {
    }
 
    //Main method
    public static void main(String[] var0) {
       HashMapSolution var1 = new HashMapSolution();
       int[] var2 = new int[]{2, 7, 11, 15};
       byte var3 = 9;
       printResult(var2, var3, var1);
       int[] var4 = new int[]{1, 2, 3, 4, 5};
       byte var5 = 10;
       printResult(var4, var5, var1);
       int[] var6 = new int[]{0, 5, -2, 8};
       byte var7 = 6;
       printResult(var6, var7, var1);
    }
 
    // Function to print the result
    public static void printResult(int[] var0, int var1, HashMapSolution var2) {
       int[] var3 = var2.TwoSum(var0, var1);
       System.out.print("Input: ");
       printArray(var0);
       System.out.println("Target: " + var1);
       System.out.println("Output: [" + var3[0] + ", " + var3[1] + "]");
       System.out.println("--------------------------");
    }
 
    // Function to print the array
    public static void printArray(int[] var0) {
       System.out.print("[");
 
       for(int var1 = 0; var1 < var0.length; ++var1) {
          System.out.print(var0[var1]);
          if (var1 != var0.length - 1) {
             System.out.print(", ");
          }
       }
 
       System.out.print("] ");
    }
 }
 

