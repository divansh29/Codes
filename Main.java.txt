import java.util.*;

public class Main {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      ArrayList<ArrayList<Integer>> graph=new ArrayList<>();
      int v=sc.nextInt();
      int e=sc.nextInt();
      for(int i=0;i<v;i++){
        graph.add(new ArrayList<>());
      }
      for(int i=0;i<e;i++){
        int s=sc.nextInt();
        int d=sc.nextInt();
        graph.get(s).add(d);
        graph.get(d).add(s);
      }
      for(int i=0;i<v;i++){
        System.out.print("vertex "+i+": ");
        for(int j=0;j<graph.get(i).size();j++){
          System.out.print(graph.get(i).get(j)+" ");  //graph.get(i).get(j) gets the j-th neighbor of vertex i, and prints its number.
          
        }
         System.out.println();
        
      }
      }
}
