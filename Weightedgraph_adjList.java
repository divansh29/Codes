//input same as before

import java.util.*;

public class Main {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      int v=sc.nextInt();
      int e=sc.nextInt();
      ArrayList<ArrayList<Edge>> graph=new ArrayList<>();
      for(int i=0;i<v;i++){
        graph.add(new ArrayList<>());
        
      }
      for(int i=0;i<e;i++){
        int s=sc.nextInt();
        int d=sc.nextInt();
        int w=sc.nextInt();
        Edge unit=new Edge(s,d,w);
       graph.get(s).add(unit);
       graph.get(d).add(unit);
      }
      for(int i=0;i<v;i++){
        System.out.print("Source "+i+":");
        for(int j=0;j<graph.get(i).size();j++){
          System.out.print("Dest->"+ graph.get(i).get(j).d+" "+"Weight->"+graph.get(i).get(j).w+" ");
        }
        System.out.println();
      }

    }
}
class Edge{
  int s,d,w;
  Edge(int s,int d,int w){
    this.s=s;
    this.d=d;
    this.w=w;
    
  }
}
     
