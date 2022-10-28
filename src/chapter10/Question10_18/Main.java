package chapter10.Question10_18;



public class Main {
    public static void main(String[] args) {
        Payable [] payables = new Payable[]{
                new Invoice("8790","Chair",4,290),
                new Employee("Kabir","Yusuf","897-332",new SalariedCompensationModel(5000)),
                new Employee("Adekunle","Akanji","985-001",new HourlyCompensationModel(98,300)),
                new Employee("Jerry","Okoro","124-650",new CommissionCompensationModel(38,0.8)),
                new Employee("Ibrahim","Malgwi","347-556",new BasePlusCommissionModel(79,0.4,895))

        };

        System.out.printf("Invoice and Employee Processed Polymorphically%n%n");

        for(Payable currentPayable: payables){

            System.out.print(currentPayable);

            if(currentPayable instanceof Employee){

                Employee employee = (Employee) currentPayable;

                String out = employee.getCompensationModel().getClass().getSimpleName();
                System.out.println(out);
            }

            System.out.printf("Payment Due: %f%n%n",currentPayable.getPaymentAmount());

        }

    }

}
