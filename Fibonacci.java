package chapter7;

public class Fibonacci {
    // Fibonacci sequence: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34...
    // each term is the sum of the two proceeding terms
    // starts with 0 then 1
    // Recursive approach
    // base case: if n==0 return 0, if n==1 return 1
    // recursive case: for n > 1, return fibonacci(n-1) + fibonacci(n-2)
    public static void main(String args[]){
        System.out.println("Fibonacci sequence");
        for (int i = 0; i < 10; i++) {
            System.out.println(fibonacciRecursive(i));
        }
        System.out.println(("Iterative Fibonacci"));
        for(int i = 0; i < 10; i++){
            System.out.println(fibonacciIterative(i));
        }
    }
    public static int fibonacciRecursive(int n){
        if(n == 0)
            return 0;
        else if(n == 1){
            return 1;
        }else {
            return (fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2));
        }
    }
    public static int fibonacciIterative(int n){
        if (n == 0)
            return 0;
        if (n == 1)
            return 1;
        int a = 0;
        int b = 1;
        int sum = 0;
        for(int i = 2; i <= n; i++){
            sum = a + b;
            System.out.print("sum is " + sum);
            a = b;
            System.out.print(" a is " + a);
            b = sum;
            System.out.println(" b is " + b + " sum is " + sum);
        }
        return sum;
    }
}
