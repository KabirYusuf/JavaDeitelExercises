package chapter9.question9_16;

public class Employee {
    private CompensationModel compensationModel;
    private String firstName;
    private String lastName;
    private String socialSecurityNumber;

    public Employee(String firstName, String lastName, String socialSecurityNumber,CompensationModel compensationModel) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurityNumber = socialSecurityNumber;
        this.compensationModel = compensationModel;
    }

    public CompensationModel getCompensationModel() {
        return compensationModel;
    }

    public void setCompensationModel(CompensationModel compensationModel) {
        this.compensationModel = compensationModel;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public double earnings(){
        return compensationModel.earnings();
    }
    @Override
    public String toString(){
        return String.format("First Name: %s%nLast Name: %s%nSSN: %s%nEarnings: %.2f",firstName,lastName,socialSecurityNumber,earnings());
    }
}
