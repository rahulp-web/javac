
package geekster;
import java.util.Scanner;

public class sum {
   public static void main (String args[]) {
	   
	 int x,y,sum;
	 Scanner sc = new Scanner(System.in);
	 
	 System.out.print("enter number");
	 x = sc.nextInt();
	 System.out.print("enter number:");
	 y = sc.nextInt();
	   
	 sum = sum(x,y);
	 System.out.println("sum of two number:"+ sum);
	 
	   
   }

 private static int sum(int x, int y) {
  int sum = x+y;
	return sum;
}
}

 



