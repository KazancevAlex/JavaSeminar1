// Написать программу вычисления n-ого треугольного числа

import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        System.out.print("Введите число : ");
        int n  = Scanner.nextInt();
        Scanner.close();
        System.out.println("Треугольное число = " + Triangle(n));
    }

    public static int Triangle(int n) {
        if (n == 1) {
            return 1;
        }
        return Triangle(n - 1) + n;
    }
}
