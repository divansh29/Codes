
//Adjacent LIST creation
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
      boolean[] vis=new boolean[v];
      for(int i=0;i<v;i++){
        if(vis[i]==false){
          dfs(graph,vis,0,v,e);
        }
      }
    }
  public static void dfs(ArrayList<ArrayList<Integer>> graph,boolean[] vis,int s,int v,int e){
    vis[s]=true;
    System.out.print(s+" ");
    for(int i=0;i<graph.get(s).size();i++){
      if(vis[graph.get(s).get(i)]==false){
dfs(graph,vis,graph.get(s).get(i),v,e):
  }
    }
  }
}
          
    
