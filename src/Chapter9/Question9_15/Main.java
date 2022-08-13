package Chapter9.Question9_15;

public class Main {
    public static void main(String[] args) {
        HourlyEmployee hourlyEmployee = new HourlyEmployee("Kabir","Yusuf","5690-654",41,200);
        //System.out.println(hourlyEmployee.earnings());

        hourlyEmployee.setHour(120);
        hourlyEmployee.setWage(20);
        System.out.println(hourlyEmployee);
    }
}
