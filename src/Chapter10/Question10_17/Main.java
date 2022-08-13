package Chapter10.Question10_17;

public class Main {
    public static void main(String[] args) {

        Employee [] employees = new Employee[]{
                new Employee("Kabir", "Yusuf", "324-213", new SalariedCompensationModel(400)),
                new Employee("Kabir", "Ade", "009-213", new HourlyCompensationModel(15, 500)),
                new Employee("Yusuf", "Ade", "074-213", new CommissionCompensationModel(400, 0.3)),
                new Employee("Akanji", "Ade", "123-456", new BasePlusCommissionModel(400, 0.3, 78)),
        };

        for(Employee employee:employees){
            System.out.println(employee);
            System.out.println(employee.getCompensationModel().getClass().getSimpleName());
            System.out.println();


            if(employee.getFirstName().equals("Kabir")){
                employee.setCompensationModel(new HourlyCompensationModel(14,1876));
                System.out.println(employee);
                System.out.printf("New Compensation Model: %s%n",employee.getCompensationModel().getClass().getSimpleName());
                System.out.println();
            }


        }

    }
}
