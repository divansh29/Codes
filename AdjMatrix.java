//Adjacent matrix creation
import java.util.*;

public class Main {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
     
      int v=sc.nextInt();
      int e=sc.nextInt();
      int[][] graph=new int[v][v];
      
      for(int i=0;i<e;i++){
        int s=sc.nextInt();
        int d=sc.nextInt();
        graph[s][d]=1;
        graph[d][s]=1;
        
      }
      boolean[] vis=new boolean[v];
      for(int i=0;i<v;i++){
        if(vis[i]==false){ //!vis[i]
          dfs(graph,vis,i,v,e);
        }
      }
    }
  public static void dfs( int[][] graph,boolean[] vis,int s,int v,int e){
    vis[s]=true;
    System.out.print(s+" ");
    for(int i=0;i<v;i++){
      if(graph[s][i]==1 && !vis[i]){
dfs(graph,vis,i,v,e);
  }
    }
  }
}
