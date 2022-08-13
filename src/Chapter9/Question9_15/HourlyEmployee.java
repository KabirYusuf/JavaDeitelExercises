package Chapter9.Question9_15;

public class HourlyEmployee extends Employee{

    private double hour;
    private double wage;
    public HourlyEmployee(String firstName, String lastName, String socialSecurityNumber, double hour, double wage) {
        super(firstName, lastName, socialSecurityNumber);

        if(hour < 0 || hour > 168){
            throw new IllegalArgumentException("Hour must be >= 0 and <= 168");
        }

        if(wage < 0){
            throw new IllegalArgumentException("Wage must be >= 0");
        }

        this.hour = hour;
        this.wage = wage;
    }

    public double getHour() {
        return hour;
    }

    public void setHour(double hour) {
        if(hour < 0 || hour > 168){
            throw new IllegalArgumentException("Hour must be >= 0 and <= 168");
        }
        this.hour = hour;
    }

    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {
        if(wage < 0){
            throw new IllegalArgumentException("Wage must be >= 0");
        }
        this.wage = wage;
    }

    public double earnings(){
        double earnings;
        double hourDifference = hour - 40;
        if(hour <= 40){
            earnings = wage * hour;
        }
        else{
            earnings = (wage * 40) + 1.5 * (wage * hourDifference);
        }
        return earnings;
    }

    @Override
    public String toString(){
        return String.format("%s%nHours worked: %.2f%nWage: %.2f%nEarnings: %.2f",super.toString(),getHour(),getWage(),earnings());
    }
}
