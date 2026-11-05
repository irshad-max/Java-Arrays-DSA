import java.util.*;

public class Main {
    public static void main(String[] args) {
      int num[]={5,6,7,8,10,20};
      HashSet<Integer>set=new HashSet<>();
      int maxcount=0;
      for(int nums : num){
          set.add(nums);
      }
      for(int s:set){
          if(!set.contains(s-1)){
              int count=1;
              int current=s;
          while(set.contains(current+1)){
              current++;
              count++;
          }
          maxcount=Math.max(maxcount,count);
      }
      }
      System.out.print(maxcount);
    }
}