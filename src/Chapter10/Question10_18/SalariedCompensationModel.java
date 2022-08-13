package Chapter10.Question10_18;

public class SalariedCompensationModel implements CompensationModel{

    private double weeklySalary;

    public SalariedCompensationModel(double weeklySalary) {
        if(weeklySalary <= 0.0){
            throw new IllegalArgumentException("Weekly Salary must be > 0.0");
        }
        this.weeklySalary = weeklySalary;
    }

    public void setWeeklySalary(double weeklySalary) {
        if(weeklySalary <= 0.0){
            throw new IllegalArgumentException("Weekly Salary must be > 0.0");
        }
        this.weeklySalary = weeklySalary;
    }

    public double getWeeklySalary() {
        return weeklySalary;
    }

    @Override
    public double earnings() {
        return getWeeklySalary();
    }

    @Override
    public String toString(){
        return String.format("Weekly Salary: %f%nEarnings: %.2f",getWeeklySalary(), earnings());
    }
}
