public class Solution {
  public int[][] generateMatrix(int size){
    int[][] matrix=new int[size][size];
    int row=0; //first row
    int col=size/2; //middle col
    
    for(int num=1;num<=size*size;num++){
      matrix[row][col]=num;
      row-=1; //move 1 step up
      col+=1; //move 1 step right
      
      if(row>=0 && col==size){  //row AV but col NA
        col=0;  //go to first col
      }
      else if(row==-1 && col < size){  //row NA but col AV
        row=size-1;  //go to last row
      }
      else if(row == -1 && col == size){  //row NA and col NA
        // back to previous position
        row+=1;
        col-=1;
        row+=1; // move 1 step down
      }
      else if(row>=0 && col < size && matrix[row][col] != 0){  //row & col AV but position occupied
         // back to previous position
        row+=1;
        col-=1;
        row+=1; // move 1 step down
      }
    }return matrix;
  }

}