package hometask24july;

public class Manager extends Employee {
    private String department;

    public Manager(String name, String department, double salary) {
        super(name, "Менеджер", salary);
        this.department = department;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Отдел: " + department);
    }
}
