package Chapter10.Question10_18;

public class HourlyCompensationModel implements CompensationModel {

    private double hour;
    private double wage;

    public HourlyCompensationModel(double hour, double wage) {
        if(wage < 0.00){
            throw new IllegalArgumentException("Wage must be > 0.00");
        }
        if (hour < 0.00 || hour > 168.00){
            throw new IllegalArgumentException("Hour must be > 0 and < 168");
        }
        this.hour = hour;
        this.wage = wage;
    }

    public void setHour(double hour) {
        if (hour < 0.00 || hour > 168.00){
            throw new IllegalArgumentException("Hour must be > 0 and < 168");
        }
        this.hour = hour;
    }

    public void setWage(double wage) {
        if(wage < 0.00){
            throw new IllegalArgumentException("Wage must be > 0.00");
        }
        this.wage = wage;
    }

    public double getHour() {
        return hour;
    }

    public double getWage() {
        return wage;
    }

    @Override
    public double earnings() {
        double hourDiff = getHour() - 40;
        if(getHour() <= 40){
            return getHour() * getWage();
        }
        else {
            return (getWage() * 40) + 1.5 * (getWage() * hourDiff);
        }
    }

    public  String toString(){
        return String.format("Hours Worked: %f%nWage: %f%nEarnings: %.2f",getHour(),getWage(),earnings());
    }
}
