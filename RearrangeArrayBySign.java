import java.util.*;
class RearrangeArrayBySign{
    public static void main(String[] args){
        int arr[]={3,1,2,-5,-2,-4};
        //extra space O(n)
        int ans[]=new int[arr.length];
        int pos=0;
        int neg=1;
        for(int x:arr){
            //x is positive so add in even
           // position like 0,2,4
            if(x>0){
                ans[pos]=x;
                pos+=2;
            }
            //x is negative so add in odd
           //position like 1,3,5
            else{
                ans[neg]=x;
                neg+=2;
            }
        }
        System.out.println(Arrays.toString(result));
    }
}
