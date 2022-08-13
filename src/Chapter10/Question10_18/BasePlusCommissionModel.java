package Chapter10.Question10_18;

public class BasePlusCommissionModel extends CommissionCompensationModel{

    private double baseSalary;

    public BasePlusCommissionModel(double grossSales, double commissionRate, double baseSalary) {
        super(grossSales, commissionRate);
        if(baseSalary < 0){
            throw new IllegalArgumentException("Base Salary must be >=0");
        }
        this.baseSalary = baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        if(baseSalary < 0){
            throw new IllegalArgumentException("Base Salary must be >=0");
        }
        this.baseSalary = baseSalary;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    @Override
    public  double earnings(){
        return super.earnings() + getBaseSalary();
    }
}
