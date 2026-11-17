import java.util.*;
public class CountInversion {
    public static void main(String[] args) {
      int arr[]={5,4,3,2,1};
      int count=0;
      int n=arr.length;
      for(int i=0;i<n;i++){
        for(int j=i;j<n;j++){
          if(arr[i]>arr[j]){
            count++;
          }
        }
      }
      System.out.println("Total inversion ="+count);
    }
}
