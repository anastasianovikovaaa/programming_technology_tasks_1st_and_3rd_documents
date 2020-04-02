package document_1_novikova;

import java.util.Scanner;

public class Part_1_conditional_statements {

    public static void task_1() {
        System.out.print("Первое число: ");
        int a = new Scanner(System.in).nextInt();

        System.out.print("Второе число: ");
        int b = new Scanner(System.in).nextInt();

        int sumOfSquares = a*a + b*b;
        double squareOfSum = a*a + 2.0*a*b + b*b;

        if (sumOfSquares >= squareOfSum) {
            System.out.print("Сумма квадратов больше, чем квадрат суммы этих чисел");
        }

        else {
            System.out.print("Квадрат суммы больше, чем сумма квадратов этих чисел");
        }

    }


    public static void task_2() {
        System.out.print("Зарплата: ");
        int salary = new Scanner(System.in).nextInt();

        System.out.print("Стаж: ");
        int exp = new Scanner(System.in).nextInt();

        double extra = 0.0;
        if (exp >= 2 && exp < 5) {
            extra = salary * 0.2;
        }

        else if (exp >= 5 && exp < 10) {
            extra = salary * 0.5;
        }

        System.out.print("Надбавка: " + extra + "\n");
        System.out.print("Сумма к выплате: " + (salary + extra));

    }


    public static void task_3() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Координаты точки А (х0, у0): ");
        int x0 = scanner.nextInt();
        int y0 = scanner.nextInt();

        System.out.print("Координаты точки B (х1, у1): ");
        int x1 = scanner.nextInt();
        int y1 = scanner.nextInt();

        double length0 = Math.sqrt(x0*x0 + y0*y0);
        double length1 = Math.sqrt(x1*x1 + y1*y1);

        if (length0 > length1) {
            System.out.print("Точка A дальше от начала координат");
        }
        else if (length1 > length0) {
            System.out.print("Точка B дальше от начала координат");
        }
        else {
            System.out.print("Точки равноудалены от начала координат");
        }

    }

    public static void task_4() {
        Scanner scan = new Scanner(System.in);
        System.out.print("стороны треугольника a b c: ");
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

        if ((a*a + b*b == c*c) || (a*a + c*c == b*b) || (b*b + c*c == a*a)) {
            System.out.print("Треугольник является прямоугольным.");
        }
        else {
            System.out.print("Треугольник не является прямоугольным.");
        }

    }

    public static void task_5() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите три числа: ");
        int[] arr = new int[3];

        for (int i = 0; i < 3; i++) {
            arr[i] = scan.nextInt();
        }

        for (int i = 0; i < 3; i++) {
            if (arr[i] > 0) {
                arr[i] *= arr[i];
            }
            System.out.print(arr[i] + "\n");
        }
    }

    public static void task_6() {
        System.out.print("Число от 1 до 12: ");
        int n = new Scanner(System.in).nextInt();
        String s = "";

        if(n == 12 || n == 1 || n == 2) {
            s = "Зима";
        }

        else if(n >= 3 && n <=5) {
            s = "Весна";
        }

        else if(n >= 6 && n <=8) {
            s = "Лето";
        }

        else if(n >= 9 && n <=11) {
            s = "Осень";
        }

        else {
            System.out.print("Внимание! Число введено неверно!");
        }

        if (!s.equals("")) {
            System.out.print("Время года: " + s);
        }
    }
}
