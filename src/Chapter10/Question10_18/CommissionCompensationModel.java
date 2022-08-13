package Chapter10.Question10_18;

public class CommissionCompensationModel implements CompensationModel{

    private double grossSales;
    private double commissionRate;

    public CommissionCompensationModel(double grossSales, double commissionRate) {
        if(grossSales < 0.0){
            throw new IllegalArgumentException("Gross Sales must be >= 0");
        }
        if(commissionRate < 0.0 || commissionRate >= 1.0){
            throw new IllegalArgumentException("Commission Rate must be > 0.0 and < 1.0");
        }
        this.grossSales = grossSales;
        this.commissionRate = commissionRate;
    }

    public void setGrossSales(double grossSales) {
        this.grossSales = grossSales;
    }

    public void setCommissionRate(double commissionRate) {
        this.commissionRate = commissionRate;
    }

    public double getGrossSales() {
        return grossSales;
    }

    public double getCommissionRate() {
        return commissionRate;
    }

    @Override
    public double earnings() {
        return getGrossSales() * getCommissionRate();
    }

    public  String toString(){
        return String.format("Gross Sales: %.2f%nCommission Rate: %.2f%nEarning: %.2f",getGrossSales(),getCommissionRate(),earnings());
    }
}
