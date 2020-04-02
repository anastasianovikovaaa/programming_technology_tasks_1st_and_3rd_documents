package document_3_novikova;

import java.util.Calendar;

public class Product {
    private String name;
    private double cost;
    private int year;
    private String manufacturer;

    public Product() {
        name = "";
        cost = 0;
        year = 0;
        manufacturer = "";
    }

    public Product(String name, int cost) {
        this.name = name;
        this.cost = cost;
        this.year = Calendar.getInstance().get(Calendar.YEAR);
        manufacturer = "DoDo";
    }

    public Product(String name, int cost, int year, String manufacturer) {
        this.name = name;
        this.cost = cost;
        this.year = year;
        this.manufacturer = manufacturer;
    }

    public int ageInYearsDetermination() {
        return Calendar.getInstance().get(Calendar.YEAR) - year;
    }

    public void raisingPrices() {
        if (ageInYearsDetermination() == 0) {
            cost += cost * 0.2;
        }
    }

    public double conversionToUSD() {
        double usd = 78.0;
        return cost / usd;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void getInfo() {
        System.out.printf("Наименование: %s\nЦена: %.2f\nГод выпуска: %d\nИзготовитель: %s\n\n", name, cost, year, manufacturer);
    }

    public static void makeProducts() {
        Product prod = new Product("Пицца", 580);
        prod.getInfo();
        System.out.println("Лет: " + prod.ageInYearsDetermination() + "\n");
        prod.raisingPrices();
        prod.setManufacturer("DonnaPizza");
        prod.getInfo();
        System.out.printf("$%.2f\n\n", prod.conversionToUSD());
    }
}
