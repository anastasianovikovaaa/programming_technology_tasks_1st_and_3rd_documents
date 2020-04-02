package document_1_novikova;

import java.util.ArrayList;
import java.util.Scanner;

public class Part_4_arrays {
    public static void task_1() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите N: ");
        int n = scan.nextInt();
        int[] a = new int[n];
        ArrayList<Integer> evens = new ArrayList<Integer>();
        ArrayList<Integer> odds = new ArrayList<Integer>();

        System.out.print("Введите с консоли N целых чисел: ");
        for (int i = 0; i < n; i++) {
            a[i] = scan.nextInt();
            if (a[i] % 2 == 0) evens.add(a[i]);
            else odds.add(a[i]);
        }

        System.out.print("Чётные числа: ");
        for (int elem : evens) {
            System.out.printf("%d ", elem);
        }

        System.out.print("\nНечётные числа: ");
        for (int elem : odds) {
            System.out.printf("%d ", elem);
        }
    }

    public static void task_2() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите N: ");
        int n = scan.nextInt();
        int[] a = new int[n];
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        System.out.print("Введите с консоли N целых чисел: ");
        for (int i = 0; i < n; i++) {
            a[i] = scan.nextInt();

            if (a[i] % 3 == 0 || a[i] % 9 == 0) {
                numbers.add(a[i]);
            }
        }

        System.out.print("Числа, которые делятся на 3 или на 9: ");
        for (int elem : numbers) {
            System.out.printf("%d ", elem);
        }
    }

    public static void task_3() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите N: ");
        int n = scan.nextInt();
        int[] a = new int[n];
        ArrayList<Integer> numbers = new ArrayList<Integer>();

        for (int i = 0; i < n; i++) {
            System.out.printf("a[%d]= ", i);
            a[i] = scan.nextInt();
            if (a[i] % 5 == 0 || a[i] % 10 == 0) {
                numbers.add(a[i]);
            }
        }

        System.out.print("Числа, которые делятся на 5 или на 10: ");
        for (int elem : numbers) {
            System.out.printf("%d ", elem);
        }
    }


    public static int NOD(int x, int y) {
        while (x != y)
        {
            if (x > y)
                x = x - y;
            else
                y = y - x;
        }
        return x;
    }

    public static int NODofNumbers(int[] arr, int n, int i, int x) {
        if (i == n)
            return x;
        int nod = NOD(x, arr[i]);
        i++;
        return NODofNumbers(arr, n, i, nod);
    }

    public static int NOK(int x, int y){
        return x / NOD(x, y) * y;
    }

    public static int NOKofNumbers(int[] arr, int n, int i, int x) {
        if (i == n)
            return x;
        int nok = NOK(x, arr[i]);
        i++;
        return NODofNumbers(arr, n, i, nok);
    }

    public static void task_4() {
        System.out.print("Введите N: ");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] a = new int[n];
        System.out.print("Введите с консоли N целых чисел: ");
        for (int i = 0; i < n; i++) {
            a[i] = scan.nextInt();
        }
        System.out.printf("НОД = %d\n", NODofNumbers(a, n, 1, a[0]));
        System.out.printf("НОК = %d", NOKofNumbers(a, n, 1, a[0]));
    }

    public static void task_5() {
        System.out.print("Введите N: ");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.printf("a[%d]= ", i);
            a[i] = scan.nextInt();
        }

        System.out.print("Простые числа: ");
        for (int i = 0; i < n; i++) {
            int elem = a[i];
            boolean fl = true;
            for (int j = 2; j <= elem/2+1; j++) {
                if (elem % j == 0 && elem!=j) {
                    fl = false;
                    break;
                }
            }
            if(fl) {
                System.out.printf("%d ", elem);
            }
        }
    }

    public static void task_6() {
        System.out.print("Введите N: ");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] a = new int[n];

        System.out.printf("Введите %d чисел: ", n);
        for (int i = 0; i < n; i++) {
            a[i] = scan.nextInt();
        }
        System.out.print("Счастливые числа: ");
        for (int i = 0; i < n; i++) {
            int p = 0;
            int number = a[i];
            while (p < 10) {
                p++;
                int sum = 0;
                while (number != 0) {
                    sum += Math.pow(number % 10, 2);
                    number /= 10;
                }
                number = sum;
                if (sum == 1){
                    System.out.print(a[i] + " ");
                    break;
                }
            }
        }
    }

    public static void task_7() {
        System.out.print("Введите любое число в диапазоне от 0 до 9: ");
        int n = new Scanner(System.in).nextInt();
        String[] strings = new String[]
                {"Ноль", "Один", "Два", "Три", "Четыре", "Пять", "Шесть", "Семь", "Восемь", "Девять"};
        int[] numbers = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

        if (n >= 0 && n <=9) System.out.print(strings[n]);
    }

}
