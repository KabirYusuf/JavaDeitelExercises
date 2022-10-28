package chapter9.question9_14;

public class BaseCommissionEmployee extends CommissionEmployee{

    private  double baseSalary;

    public BaseCommissionEmployee(String firstName, String lastName, String socialSecurityNumber, double grossSales, double commissionRate, double baseSalary) {
        super(firstName, lastName, socialSecurityNumber, grossSales, commissionRate);

        if(baseSalary < 0.0){
            throw new IllegalArgumentException("Base salary must be >= 0.0");
        }

        this.baseSalary = baseSalary;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    @Override
    public double earnings(){
        return baseSalary + (super.earnings());
    }

    @Override
    public String toString(){
        return String.format("%s%nEarning for an employee with base salary: %f", super.toString(),earnings());
    }
}
