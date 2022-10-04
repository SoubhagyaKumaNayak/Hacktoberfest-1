
import java.util.*;
class Fibonacci
{
    static int fib(int i)
    {
        if (i <= 1)
            return i;
        return fib(i - 1) + fib(i - 2);
    }
 
    public static void main(String args[]) 
    {
        
        Scanner sc=new Scanner(System.in);
        int s=sc.nextInt();
        int res=fibonaci(s);
        System.out.print(res); 

        
    }
}
