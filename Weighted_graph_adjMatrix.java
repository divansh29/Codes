
//input
//5 6
// 0 1 5
// 1 2 10
// 2 3 13
// 3 4 1
// 0 3 15
// 1 3 6

//adjacent matrix of weighted graph
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
        int w=sc.nextInt();
        graph[s][d]=w;
        graph[d][s]=w;
      }
      for(int i=0;i<v;i++ ){
        for(int j=0;j<v;j++){
          System.out.print(graph[i][j]+" ");
          
        }
        System.out.println();
      }
  }
}
