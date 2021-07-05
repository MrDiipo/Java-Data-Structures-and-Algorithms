package Algorithms.Recursion;

public class PowerOfNumbers {
    public static void main(String... args){
        System.out.println(PowerOfNumbers.power(3, 3));
    }
    public static int power(int base, int power){
        if (base < 0 || power < 0){
            System.out.println("Can't find the value of such number!");
        }
        if (power == 0){
            return 1;
        }
        if (power == 1){
            return base;
        }
        power = power - 1;
        return base * power(base, power);
    }
}
