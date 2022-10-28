package chapter10.question10_16;

public class HourlyEmployee extends Employee{

    private double wage;
    private double hours;
    public HourlyEmployee(String firstName, String lastName, String socialSecurityNumber, double wage, double hours) {
        super(firstName, lastName, socialSecurityNumber);

        if(wage < 0.0){
            throw new IllegalArgumentException("Wage must be >= 0.0");
        }

        if((hours < 0.0) || (hours > 168.0)){
            throw new IllegalArgumentException("Hours Worked must be >= 0.0 or <= 168.0");
        }

        this.wage = wage;
        this.hours = hours;
    }

    public void setWage(double wage) {
        if(wage < 0.0){
            throw new IllegalArgumentException("Wage must be >= 0.0");
        }
        this.wage = wage;
    }

    public void setHours(double hours) {
        if((hours < 0.0) || (hours > 168.0)){
            throw new IllegalArgumentException("Hours Worked must be >= 0.0 or <= 168.0");
        }
        this.hours = hours;
    }

    public double getWage() {
        return wage;
    }

    public double getHours() {
        return hours;
    }

    @Override
    public double earnings() {
        double hoursDiff = getHours() - 40;
        if(getHours() <= 40){
            return getHours() * getWage();
        }
        else{
            return (getWage() * 40) + 1.5 * (getWage() * hoursDiff);
        }
    }

    @Override
    public String toString(){
        return String.format("%s%n%s: %.2f%n%s: %.2f",super.toString(),"Hours Worked",getHours(), "Wage",getWage());
    }
}
