public abstract class Employee {

    private String name;
    private String niNumber;
    private double salary;

    public Employee(String name, String niNumber, double salary) {
        this.name = name;
        this.niNumber = niNumber;
        this.salary = salary;
    }

    // GETTERS and SETTERS

    public String getName() {
        return this.name;
    }

    public String getniNumber() {
        return this.niNumber;
    }

    public double getSalary() {
        return this.salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNiNumber(String niNumber) {
        this.niNumber = niNumber;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    // EXTRA METHODS

    public void raiseSalary(double increase) {
        this.salary = salary * increase;
    }

    public double payBonus() {
        return this.salary * 0.01;
    }

}
