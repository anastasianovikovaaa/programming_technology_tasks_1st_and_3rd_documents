package document_3_novikova;

public class ProperFraction {
    private int numerator;
    private int denominator;

    public ProperFraction() {
        numerator = 3;
        denominator = 5;
    }

    public ProperFraction(int numerator, int denominator) {
        if (denominator != 0) {
            if (numerator < denominator) {
                this.numerator = numerator;
                this.denominator = denominator;
            }
            else throw new IllegalArgumentException("Неправильная дробь! Числитель должен быть меньше знаменателя.");
        }
        else throw new IllegalArgumentException("Знаменатель не должен быть равен нулю!");
    }

    public double convertToPercent() {
        return (double)numerator / denominator * 100.0;
    }

    public int sum(int n) {

        int sum = 0;
        while (n != 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }

    public int sumOfNumbers() {
        return sum(numerator) + sum(denominator);
    }

    public void getInfo() {
        System.out.printf("Дробь: %d/%d\nЗачение дроби в процентах: %.0f%%\nСумма цифр значения знаменателя и числителя: %d",
                numerator, denominator, convertToPercent(), sumOfNumbers());
    }

    public static void makeFractions() {
        ProperFraction p = new ProperFraction(7,10);
        p.getInfo();
    }
}
