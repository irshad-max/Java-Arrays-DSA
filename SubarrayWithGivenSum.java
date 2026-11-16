public class SubarrayWithGivenSum {
    public static void main(String[] args) {
      int arr[]={1,4,20,3,10,5};
      int n=arr.length-1;
      int target=33;
      int sum=0;
      for(int i=0;i<=n;i++){
            sum=0;
            for(int j=i;j<=n;j++){
              sum+=arr[j];
              if(sum==target){
                System.out.println("found between "+i+" "+j);
                break;
              }
            }
      }
    }
}
