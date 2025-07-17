import java.util.*;

public class Main {
    public static void main(String[] args) {
      Box b1=new Box();
      System.out.println(b1.w);
    
      Boxweight box4=new Boxweight(5.8,9.7,4.5,7.9);
      System.out.println(box4.l+" "+box4.weight+" "+box4.w+" "+box4.h);
    }
    
   public  static class  Box {
  double l;
  double h;
  double w;
  Box(){
    this.h=-1;
    this.l=-9;
    this.w=-8;
  }
  Box(double side,double t,double h){
    this.l=side;
    this.h=t;
    this.w=h;
  }}
  public static class Boxweight extends Box{
    double weight;
    public Boxweight(){
      this.weight=-1;
      
    }
    public Boxweight(double l,double h,double w,double weight){
      super(l,h,w);
      this.weight=weight;
    }
  }
  }
