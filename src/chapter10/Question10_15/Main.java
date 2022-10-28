package chapter10.Question10_15;

public class Main {
    public static void main(String[] args) {

        Employee [] employees = new Employee[]{
                new SalariedEmployee("Kabir", "Yusuf","768-334",4000),
                new Pieceworker("Ade", "Bola","768-334",200,4)
        };


        for (Employee employee: employees){
            System.out.println(employee);
        }
    }
}
