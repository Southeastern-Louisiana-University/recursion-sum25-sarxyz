package chapter7;

public class Factorial {

    public static void main(String args[]){
        System.out.println("Factorial Solution");
        // factorial of number n is defined as:
        // n! = n x (n-1) x (n-2) ... x 1
        // 5! = 5 x 4 x 3 x 2 x 1 = 120
        // recursive approach
        // base case if n == 0 or n == 1 then return 1
        // recursive case for n > 1, return n x (n-1)!
        System.out.println("factorial of n is " + factorial(15));

        // iterative solution
        long fact = 1;
        for (int i = 15; i > 0; i--){
            fact *= i;
        }
        System.out.println("iterative factorial is: " +  fact);
    }
    public static long factorial (int n){
        if (n == 0 || n==1)
            return 1;
        else {
            return n * factorial(n-1);
        }
    }
}
