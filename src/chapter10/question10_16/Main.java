package chapter10.question10_16;

public class Main {
    public static void main(String[] args) {
        Payable [] payableObjects = new Payable[]{
              new Invoice("276","Chair",2,300),
              new Invoice("109","Table",3,950),
              new SalariedEmployee("Kabir","Yusuf","33-546",5000),
              new HourlyEmployee("Ade", "Akanji","048-323",700,30),
              new CommissionEmployee("Bola","Jide","098-997",690,0.3),
              new BasePlusCommissionEmployee("Hakeem", "Nura","980-554",760,0.5,1007)

        };

        System.out.println("Invoice and Employee Processed Polymorphically");

        for(Payable currentPayable: payableObjects){
            System.out.printf("%n%s  %n", currentPayable);

            if(currentPayable instanceof BasePlusCommissionEmployee){

                BasePlusCommissionEmployee payable = (BasePlusCommissionEmployee) currentPayable;

                payable.setBaseSalary((0.1 * payable.getBaseSalary()) + payable.getBaseSalary());

                System.out.printf("New base salary with 10%% increase is: $%,.2f%n", payable.getBaseSalary());

            }

            System.out.printf("Payment Due: $%,.2f%n",currentPayable.getPaymentAmount());
        }
    }
}
