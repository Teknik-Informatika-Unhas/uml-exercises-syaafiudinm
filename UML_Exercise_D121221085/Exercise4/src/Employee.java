public class Employee extends Person {

    protected double totalSalary;

    protected void setTotalSalary(double totalSalary){
        this.totalSalary = totalSalary;
    }

    protected void calculateSalary() {

    }

    protected double getTotalSalary(){
        return totalSalary;
    }
}