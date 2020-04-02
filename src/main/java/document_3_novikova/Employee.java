package document_3_novikova;

import java.util.Calendar;

public class Employee {
    private String surname;
    private String post;
    private int salary;
    private int yearOfBirth;

    public Employee() {
        surname = "";
        post = "";
        salary = 0;
        yearOfBirth = 0;
    }

    public Employee(String surname, String post, int salary, int yearOfBirth) {
        this.surname = surname;
        this.post = post;
        this.salary = salary;
        this.yearOfBirth = yearOfBirth;
    }

    public Employee(String surname, int salary, int yearOfBirth) {
        this.surname = surname;
        post = "";
        this.salary = salary;
        this.yearOfBirth = yearOfBirth;
    }

    public void raisingSalary() {
        salary += salary * 0.15;
    }

    public int getAge() {
        return Calendar.getInstance().get(Calendar.YEAR) - yearOfBirth;
    }

    public void getInfo() {
        System.out.printf("Фамилия: %s\nДолжность: %s\nОклад: %d\nГод рождения: %d\nВозраст: %d\n\n",
                surname, post, salary, yearOfBirth, getAge());
    }

    public static void makeEmployees() {
        Employee[] worker = new Employee[3];
        worker[0] = new Employee("Соколов", 35000, 1992);
        worker[1] = new Employee("Антонов", "Повар", 28000, 1983);
        worker[2] = new Employee("Сидорова", "Менеджер", 33000, 1996);

        for (Employee e : worker) {
            e.getInfo();
            e.raisingSalary();
            e.getInfo();
        }
    }
}
