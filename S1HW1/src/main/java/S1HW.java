//Реализовать функцию возведения числа а в степень b. a, b – целые числа.
//
//Пример 1: а = 3, b = 2, ответ: 9
//Пример 2: а = 2, b = -2, ответ: 0.25
//Пример 3: а = 3, b = 0, ответ: 1


import java.util.Scanner;
import static java.lang.Math.pow;

public class S1HW {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Raising the number a to the power of b");
        System.out.print("Enter a: ");
        int a = Integer.parseInt(scn.nextLine());
        System.out.print("Enter b: ");
        int b = Integer.parseInt(scn.nextLine());
        System.out.printf("Result: %.3f", abPower(a,b));
    }
    static double abPower(int a, int b) {
        return pow(a,b);
    }
}
