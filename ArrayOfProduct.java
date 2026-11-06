import java.util.*;

public class Main {
    public static void main(String[] args) {
      int arr[]={1,2,0,4};
      int[] prod=new int[arr.length];
      int sum;
      int current;
      for(int i=0;i<arr.length;i++){
          current=i;
          sum=1;
          for(int j=0;j<arr.length;j++){
              if(current==j){
                  continue;
              }
              else{
                  sum*=arr[j];
              }
          }
          prod[current]=sum;
      }
      System.out.print(Arrays.toString(prod));
    }
}