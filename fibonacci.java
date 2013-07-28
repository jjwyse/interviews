public class fibonacci{
public static int fibonacciRecursive(int n)  {
    if(n == 0)
        return 0;
    else if(n == 1)
      return 1;
   else
      return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
}

public static void main (String [] args)
{
	// 0,1,1,2,3,5,8,13,21....
   System.out.println("fibonacciRecursive for 5: " + fibonacciRecursive(6));
}
}
