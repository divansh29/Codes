//Leetcode valid subsequence 
import java.util.*;

public class Main {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
   
      String s=sc.next();
      
      String t=sc.next();
      boolean result =isb(s,t);
      System.out.println(result);
      
      
    
  }
  public static boolean isb(String s,String t){
        
      
   
        int i=0,j=0;
        char ss[]=s.toCharArray();
        char tt[]=t.toCharArray();
        int sl=s.length();
        int tl=t.length();
        if(sl<1){
          return true;
        }
        while(i<tl){
          if(ss[j]==tt[i]){
            j++;
          }
          i++;
          if(j==sl){
            return true;
          }
          
        }
        return false;
      }
          
}
