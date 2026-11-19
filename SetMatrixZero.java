import java.util.*;

public class Main {
    public static void main(String[] args) {
      int[][] matrix={
        {1,1,1},
        {1,0,1},
        {1,1,1}
      };
      int r=0;
      int c=0;
      int n=matrix.length-1; 
      for(int i=0;i<=n;i++){
        for(int j=0;j<=n;j++){
          if(matrix[i][j]==0){
           r=i;
           c=j;
            break;
          }
        }
      }
      for(int i=0;i<=n;i++){
        matrix[r][i]=0;
        matrix[i][c]=0;
      }
      for(int i=0;i<=n;i++){
        for(int j=0;j<=n;j++){
          System.out.print(matrix[i][j]+",");
        }
        System.out.println();
    }
    }
}
