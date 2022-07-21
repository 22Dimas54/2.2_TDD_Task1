public class Bank {
    private final static double ONE_HUNDRED_PERCENT =100;
    private final static double MONTHS_OF_THE_YEAR =12;
    public double CalculationOfMonthlyPayment(Client client) {
        double ratePerMonth = client.getInterestRate()/ONE_HUNDRED_PERCENT/MONTHS_OF_THE_YEAR;
        return Math.round(client.getLoanAmount()* (ratePerMonth * Math.pow((1 + ratePerMonth), client.getNumberfMonths()) /
                (Math.pow((1 + ratePerMonth),  client.getNumberfMonths()) - 1)) * 100.0) / 100.0;
    }
/*
Сложную формулу расчета полной стоимости кредита не стал реализовывать,
задача ведь была попробовать TDD. Не привычна такая реализация, но интересная)
 */
    public double CalculationOfTheTotalAmountToBeRefundedToTheBank(Client client) {
        return CalculationOfMonthlyPayment(client)*client.getNumberfMonths();
    }

    public double CalculationOfOverpaymentForTheEntirePeriod(Client client) {
        return CalculationOfTheTotalAmountToBeRefundedToTheBank(client)-client.getLoanAmount();
    }
}
