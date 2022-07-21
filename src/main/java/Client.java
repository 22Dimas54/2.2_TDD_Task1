public class Client {
    private String name;
    private String surName;
    private int loanAmount;
    private double interestRate;
    private int numberfMonths;

    public Client(String name, String surName, int loanAmount, double interestRate, int numberfMonths) {
        this.name = name;
        this.surName = surName;
        this.loanAmount = loanAmount;
        this.interestRate = interestRate;
        this.numberfMonths = numberfMonths;
    }

    public int getLoanAmount() {
        return loanAmount;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public int getNumberfMonths() {
        return numberfMonths;
    }
}
