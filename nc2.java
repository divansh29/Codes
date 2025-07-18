//nc2 code to choose unique pairs ,also can handle big numbers;
//BigInteger use
import java.util.*;
import java.math.*;

public class Main {
  
  public static BigInteger factorial(int n){
    BigInteger result = BigInteger.ONE;
    for(int i = 2; i <= n; i++){
      result = result.multiply(BigInteger.valueOf(i));
    }
    return result;
  }
    
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    BigInteger gre = factorial(n)
      .divide(factorial(2).multiply(factorial(n-2)));
    System.out.println(gre);
  }
}
