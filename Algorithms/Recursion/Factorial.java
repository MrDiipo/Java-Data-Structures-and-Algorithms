package Algorithms.Recursion;

public class Factorial {
    public static void main(String[] args){
        int factorial = Factorial.factorial(16);
        System.out.println(factorial);

    }
    public static int factorial(int n){
        if (n < 0){
            System.out.println("Cannot find the factorial for a negative integer");
            return -1;
        }
        if (n > 0) {
            return n * factorial(n-1);
        } else {
            return 1;
        }

    }
}
