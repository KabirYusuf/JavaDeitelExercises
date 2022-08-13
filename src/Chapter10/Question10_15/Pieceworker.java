package Chapter10.Question10_15;

public class Pieceworker extends Employee{

    private double wage;
    private int pieces;

    public Pieceworker(String firstName, String lastName, String socialSecurityNumber, double wage, int pieces) {
        super(firstName, lastName, socialSecurityNumber);

        if(wage < 0.0){
            throw new IllegalArgumentException("Wage must be > 0.0");
        }
        if(pieces < 0){
            throw new IllegalArgumentException("Pieces must be > 0");
        }
        this.wage = wage;
        this.pieces = pieces;
    }

    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {
        this.wage = wage;
    }

    public int getPieces() {
        return pieces;
    }

    public void setPieces(int pieces) {
        this.pieces = pieces;
    }

    @Override
    public double earnings() {
        return getPieces() * getWage();
    }

    @Override
    public String toString(){
        return String.format("%n%sEarning: %.2f",super.toString(),earnings());
    }
}
