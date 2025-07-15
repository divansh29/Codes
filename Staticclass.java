import java.util.*;

//as in this the class Test is depending on Class Main so without creating instance/obj of Main we cant proceed

public class Main {
  class Test {
    static String name;

    public Test(String name) {
        Test.name = name;
    }
}
    public static void main(String[] args) {
      Main obj=new Main();
    
        Test a = obj.new Test("Kunal");
        Test b = obj.new Test("Rahul");

        System.out.println(a.name); // Output: Rahul
        System.out.println(b.name); // Output: Rahul
    }
}

//   Else make the static class Test so that it dont depend on anyone
//   import java.util.*;



// public class Main {
//   static class Test {
//     static String name;

//     public Test(String name) {
//         Test.name = name;
//     }
// }
//     public static void main(String[] args) {
    
    
//         Test a = new Test("Kunal");
//         Test b = new Test("Rahul");

//         System.out.println(a.name); // Output: Rahul
//         System.out.println(b.name); // Output: Rahul
//     }
// }
  
