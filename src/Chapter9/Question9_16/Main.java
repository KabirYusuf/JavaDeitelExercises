package Chapter9.Question9_16;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee("Kabir","Yusuf",
                "33-76",new CommissionCompensationModel(200,500));
        System.out.println(employee);

        employee.setCompensationModel(new BasePlusCommissionCompensationModel(200,40,10));
        System.out.println(employee);

    }
}
