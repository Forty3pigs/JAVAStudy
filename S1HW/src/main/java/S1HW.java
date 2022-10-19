//Вычислить n-ое треугольного число(сумма чисел от 1 до n), n! (произведение чисел от 1 до n)
//
//Вывести все простые числа от 1 до 1000
//
//Реализовать простой калькулятор


import java.util.Scanner;

public class S1HW {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter n: ");
        int n = Integer.parseInt(scn.nextLine());
        System.out.printf("sum: %d \nfact: %d\n", Triangle(n)[0], Triangle(n)[1]);
        int fin = 1000;
        for (int i = 0; i < fin; i++) {
            if (checkSimple(i)) System.out.printf("%d ",i );
        }
        System.out.println("\n\nCalculator\nEnter a:");
        int a = Integer.parseInt(scn.nextLine());
        System.out.println("Enter b:");
        int b = Integer.parseInt(scn.nextLine());
        System.out.println("Enter operand:");
        String op = scn.nextLine();
        System.out.printf("Result: %f", calc(a,b,op));
    }

    static int[] Triangle(int n) {
        int[] sf = new int[]{0,1};
        for (int i = 1; i <= n; i++) {
            sf[0] = sf[0] + i;
            sf[1] = sf[1] * i;
        }
        return sf;
    }
    static boolean checkSimple(int n) {
            if (n == 2 || n == 3)
                return true;
            if (n <= 1 || n % 2 == 0 || n % 3 == 0)
                return false;
            for (int i = 5; i * i <= n; i += 6) {
                if (n % i == 0 || n % (i + 2) == 0)
                    return false;
            }
            return true;
    }
    static double calc(int a, int b, String arg){
        switch (arg) {
            case ("+"):
                return a+b;
            case ("-"):
                return a-b;
            case ("*"):
                return a*b;
            case ("/"):
                if (b !=0)
                return a/b;
                else {
                    System.out.println("Zero divider");
                    break;
                }
            default:
                System.out.println("wrong!");
                break;
        }
        return 0;
    }


}

