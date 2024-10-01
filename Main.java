import java.util.*;

public class Main {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      int size=sc.nextInt();
      int[][] matrix = new Solution().generateMatrix(size);
      printMatrix(matrix);
  }
  
  public static void printMatrix(int[][] matrix){
    for(int[] row : matrix){
      for(int value: row){
        System.out.print(value + "\t");
      }
      System.out.println();
    }
  }
}