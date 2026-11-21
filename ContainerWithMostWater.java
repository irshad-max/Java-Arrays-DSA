import java.util.*;

public class Main {
    public static void main(String[] args) {
      int arr[] = {5, 2, 12, 1, 5, 3, 4, 8};
      int left=0;
      int right=arr.length-1;
      int area=0;
      int check=0;
      while(left<right){
       area=(right-left)*Math.min(arr[left],arr[right]);
       if(arr[left]>arr[right]){
        right--;
       }
       else{
        left++;
       }
          check=Math.max(check,area);
     }
     System.out.println(check);
    }
}
