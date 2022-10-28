package chapter9.Question9_14;

public class CommissionEmployee extends Employee{
    private double grossSales;
    private double commissionRate;

    public CommissionEmployee(String firstName, String lastName, String socialSecurityNumber,double grossSales,double commissionRate) {
        super(firstName, lastName, socialSecurityNumber);

        if(grossSales < 0.0){
            throw new IllegalArgumentException("Gross sales must be >= 0.0");
        }

        if(commissionRate <= 0.00 || commissionRate >= 1.0){
            throw new IllegalArgumentException("Commission rate must be > 0.0 and < 1.0");
        }

        this.grossSales = grossSales;
        this.commissionRate = commissionRate;
    }

    public double getGrossSales() {
        return grossSales;
    }

    public void setGrossSales(double grossSales) {
        this.grossSales = grossSales;
    }

    public double getCommissionRate() {
        return commissionRate;
    }

    public void setCommissionRate(double commissionRate) {
        commissionRate = commissionRate;
    }

    public double earnings(){
        double earning = grossSales * commissionRate;
        return earning;
    }

    @Override
    public String toString(){
        return String.format("%s%nGross Sales: %s%n" +
                "Commission Rate: %s%nEarnings: %s",super.toString(),getGrossSales(),getCommissionRate(),earnings());
    }
}
