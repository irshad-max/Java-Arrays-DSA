import java.util.*;

public class Main {
    public static void main(String[] args) {
      int[][] matrix={
        {1,2,3},
        {4,5,6},
        {7,8,9}
      };
      int n=matrix.length;
      int temp=0;
      int left=0;
      int right=n-1;
      int p=0;
     for(int i = 0; i < n; i++) {
    for(int j = i + 1; j < n; j++) {
        temp = matrix[i][j];
        matrix[i][j] = matrix[j][i];
        matrix[j][i] = temp;
    }
}

  while(p<=right){
    temp=matrix[p][left];
    matrix[p][left]=matrix[p][right];
    matrix[p][right]=temp;
    p++;
  }
        for(int i=0;i<n;i++){
        for(int j=0;j<n;j++){
      System.out.print(matrix[i][j]+" ");
        }
        System.out.println();
      }
    }
}
