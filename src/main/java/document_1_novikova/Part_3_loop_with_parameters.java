package document_1_novikova;

import java.util.Scanner;

public class Part_3_loop_with_parameters {

    public static void task_1() {
        System.out.print("Введите 2 числа (a и b): ");
        int a = new Scanner(System.in).nextInt();
        int b = new Scanner(System.in).nextInt();
        if (a < b) {
            int n = 0;
            for (int i = a; i <= b; i++) {
                System.out.print(i + " ");
                n++;
            }
            System.out.print("\n" + "N = " + n);
        }
    }


    public static void task_2() {
        System.out.print("Введите 2 числа (a и b): ");
        int a = new Scanner(System.in).nextInt();
        int b = new Scanner(System.in).nextInt();

        if (a < b) {
            int n = 0;
            for (int i = b-1; i>a; i--) {
                System.out.print(i + " ");
                n++;
            }
            System.out.print("\n" + "N = " + n);
        }
    }

    public static void task_3() {
        System.out.print("Введите A и N (A в степени N): ");
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        int n = scanner.nextInt();

        if (n > 0) {
            double power = 1.0;
            for (int i = 1; i <= n; i++) {
                power *= a;
            }
            System.out.print("a^N = " + power);
        }
    }

    public static void task_4() {
        System.out.print("Введите A и N: ");
        Scanner scan = new Scanner(System.in);
        double a = scan.nextDouble();
        int n = scan.nextInt();

        if (n > 0) {
            double power = 1.0;
            for (int i = 1; i <= n; i++) {
                power *= a;
                double int_power = Math.floor(power);
                double ost = power - int_power;

                if (ost == 0.0) {
                    System.out.printf("a^%d = %f\n", i, power);
                }
            }
        }
    }



}
