package Chapter10.Question10_15;

public class SalariedEmployee extends Employee{

    private double weeklySalary;

    public SalariedEmployee(String firstName, String lastName, String socialSecurityNumber, double weeklySalary) {
        super(firstName, lastName, socialSecurityNumber);

        if(weeklySalary < 0.0){
            throw new IllegalArgumentException("Weekly Salary must  > 0.0");
        }

        this.weeklySalary = weeklySalary;
    }

    public double getWeeklySalary() {
        return weeklySalary;
    }

    public void setWeeklySalary(double weeklySalary) {
        this.weeklySalary = weeklySalary;
    }

    @Override
    public double earnings() {
        return getWeeklySalary();
    }

    @Override
    public String toString(){
        return String.format("%sEarnings: %.2f",super.toString(),getWeeklySalary());
    }
}
