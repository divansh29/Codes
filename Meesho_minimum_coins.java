//💡 Problem Statement: Minimum Steps to Reach a Target Using Natural Numbers
// 🔍 Description:
// You are located at position 0 on a number line. You want to reach a target position n (which can be positive or negative).

// On each move, starting from 1, you can either add or subtract the next natural number:

// On the 1st move: step of size 1

// On the 2nd move: step of size 2

// On the 3rd move: step of size 3

// and so on...

// At every step, you may choose the direction — you can either move to the right (positive) or to the left (negative).

// Your task is to determine the minimum number of steps required to reach exactly position n.

// 🧠 Approach:
// At every step, you add the next natural number to a sum.

// Your goal is to find the smallest number of steps such that:

// The cumulative sum is greater than or equal to n (in absolute value), and

// The difference between this sum and the target is even (so that changes in direction can fix the overshoot).

// 📝 Input:
// An integer n representing the target location on the number line.
// Constraints:

// -10^6 ≤ n ≤ 10^6

// ✅ Output:
// An integer representing the minimum number of coins required to exactly reach the target.

// 📥 Example Input: 2 
// output:6
import java.util.*;
class Main {
    public static int minCoinsToreach(int target){
        target=Math.abs(target);
        int sum=0;
        int step=0;
        while(true){
            step++;
            sum=sum+step;
            if(sum>=target && (sum-target)%2==0){
                return sum;
            }
        }
        
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int result=minCoinsToreach(n);
        System.out.println(result);
    }
}
