package Algorithms.Recursion;

//This program calculates the sum of all individual digits in a number
public class SumOfDigits {
    public static void main(String... args){
        System.out.println(SumOfDigits.sumOfDigit(45115));
    }
    public static int sumOfDigit(int n) {
        if (n == 0 || n < 0) {
            return 0;
        }
            return n % 10 + sumOfDigit(n / 10);
        }
    }
