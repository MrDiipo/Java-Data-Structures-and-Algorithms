package Algorithms.Recursion;

public class DecimalToBinary {
    public static void main(String... args){
        System.out.println(DecimalToBinary.decimalToBinaryFirst(10));
        System.out.println(DecimalToBinary.decimalToBinarySecond(10));
    }
    public static String decimalToBinaryFirst(int num){
        if(num < 0){
            return "";
        }
        if (num == 1){
            return "1";
        }
        int remainder = num % 2;
        return decimalToBinaryFirst(num / 2) + "" + remainder;
    }
    public static int decimalToBinarySecond(int num){
        if (num == 0){
            return 0;
        }
        return num%2 + 10 * decimalToBinarySecond(num/2);
    }
}
