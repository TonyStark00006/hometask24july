package hometask24july;

public class Developer extends Employee {
    private String mainProgrammingLanguage;

    public Developer(String name, String mainProgrammingLanguage, double salary) {
        super(name, "Разработчик", salary);
        this.mainProgrammingLanguage = mainProgrammingLanguage;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Основной язык программирования: " + mainProgrammingLanguage);
    }
}
