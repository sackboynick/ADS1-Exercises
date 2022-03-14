import java.util.Calendar;

public class Main {
    public static int fibonacciIterative(int n) {
        if(n <= 1) {
            return n;
        }
        int fib = 1;
        int prevFib = 1;

        for(int i=2; i<n; i++) {
            int temp = fib;
            fib+= prevFib;
            prevFib = temp;
        }
        return fib;
    }

    public static int fibonacciRecursive(int n) {
        if(n <= 1) {
            return n;
        }
        return fibonacciRecursive(n-1) + fibonacciRecursive(n-2);
    }

    public static void main(String[] args) {
        System.out.println(Calendar.getInstance().getTimeInMillis());
        System.out.println(fibonacciIterative(15));
        System.out.println(Calendar.getInstance().getTimeInMillis());
        System.out.println(fibonacciRecursive(15));
        System.out.println(Calendar.getInstance().getTimeInMillis());
    }
}
