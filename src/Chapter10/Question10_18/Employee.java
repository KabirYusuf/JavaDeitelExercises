package Chapter10.Question10_18;



public class Employee implements Payable {
        private String firstName;
        private String lastName;
        private String socialSecurityNumber;
        private CompensationModel compensationModel;


        public Employee(String firstName, String lastName, String socialSecurityNumber, CompensationModel compensationModel) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.socialSecurityNumber = socialSecurityNumber;
            this.compensationModel = compensationModel;
        }

        public void setCompensationModel(CompensationModel compensationModel) {
            this.compensationModel = compensationModel;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public void setSocialSecurityNumber(String socialSecurityNumber) {
            this.socialSecurityNumber = socialSecurityNumber;
        }

        public CompensationModel getCompensationModel() {
            return compensationModel;
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

        public double getPaymentAmount(){
            return getCompensationModel().earnings();
        }

        @Override
        public String toString(){
            return String.format("First Name: %s%nLast Name: %s%nSSN: %s%n",getFirstName(),getLastName(),getSocialSecurityNumber());
        }

}
