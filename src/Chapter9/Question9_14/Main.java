package Chapter9.Question9_14;

public class Main {
    public static void main(String[] args) {

        BaseCommissionEmployee baseCommissionEmployee = new BaseCommissionEmployee
                ("Kabir","Yusuf", "33-44-55", 5000,0.04,300);
        baseCommissionEmployee.earnings();
        System.out.println(baseCommissionEmployee);

        baseCommissionEmployee.setBaseSalary(700);
        System.out.println(baseCommissionEmployee);

    }
}
