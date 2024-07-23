package hometask24july;

public class Employee {
    private String name;
    private String position;
    private double salary;

    public Employee(String newName, String newPosition, double newSalary) {
        name = newName;
        position = newPosition;
        salary = newSalary;
    }

    public void displayInfo() {
        System.out.println("Имя: " + name + ", Должность: " + position + ", Зарплата: " + salary);
    }
}
