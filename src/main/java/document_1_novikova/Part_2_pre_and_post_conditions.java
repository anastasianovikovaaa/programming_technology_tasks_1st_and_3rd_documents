package document_1_novikova;

import java.util.Scanner;

public class Part_2_pre_and_post_conditions {

    public static void task_1() {
        int n = 50;
        for (int i = 1; i <= n; i++) {
            if (i % 5 != 0 && i % 3 == 0) {
                int p = i;
                int sum = 0;
                while (p != 0) {
                    sum += p % 10;
                    p /= 10;
                }

                if (sum % 5 != 0 && sum % 3 == 0) {
                    System.out.print(i + " ");
                }
            }
        }
    }

    public static void task_2() {
        System.out.print("Введите число N: ");
        int n = new Scanner(System.in).nextInt();
        System.out.print("Все числа кратные пяти для чисел от 1 до N: ");
        for (int i = 1; i < n; i++) {
            if (i % 5 == 0) {
                System.out.print(i + " ");
            }
        }
    }

    public static void task_3() {
        System.out.print("Введите натуральное число: ");
        int n = new Scanner(System.in).nextInt();
        int power = 1;
        if (n > 0) {
            while (power < n) {
                power *= 2;
            }

            if (power == n) System.out.print("Заданное число является степенью двойки");
            else System.out.print("Заданное число не является степенью двойки");
        }
    }

    public static void task_4() {
        System.out.print("Введите число: ");
        int n = new Scanner(System.in).nextInt();
        int a1 = 1;
        int a2 = 1;
        int an;
        System.out.printf("%d %d ", a1, a2);
        while ((an = a1 + a2) < n) {
            a1 = a2;
            a2 = an;
            System.out.printf("%d ", an);
        }
    }
}
