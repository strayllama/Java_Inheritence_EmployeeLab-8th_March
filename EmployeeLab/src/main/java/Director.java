public class Director extends Manager {
    private double budget;

    public Director(String name, String niNumber, double salary, String deptname,double budget){
        super(name, niNumber, salary, deptname);
        this.budget = budget;
    }

    public double getBudget() {
        return this.budget;
    }

}
