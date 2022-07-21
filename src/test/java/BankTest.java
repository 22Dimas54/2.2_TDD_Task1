import org.junit.jupiter.api.*;
import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BankTest {
    Bank sut;

    @BeforeEach
    public void init() {
        System.out.println("test started");
        sut = new Bank();
    }

    @BeforeAll
    public static void started() {
        System.out.println("tests started");
    }

    @AfterEach
    public void finished() {
        System.out.println("test compiled");
    }

    @AfterAll
    public static void finishedAll() {
        System.out.println("tests finished");
    }

    @Test
    public void testCalculationOfMonthlyPayment() {
        Client client = new Client("Bob", "Bobow", 750_000, 9.5, 60);
        //arrange
        double expected = 15751.40;
        //act
        double result = sut.CalculationOfMonthlyPayment(client);
        //assert
        assertEquals(expected, result);
    }

    @Test
    public void testCalculationOfTheTotalAmountToBeRefundedToTheBank() {
        Client client = new Client("Bob", "Bobow", 750_000, 9.5, 60);
        //arrange
        double expected = 944_931.11;
        //act
        double result = sut.CalculationOfTheTotalAmountToBeRefundedToTheBank(client);
        //assert
        assertEquals(expected, result);
    }
    @Test
    public void testCalculationOfOverpaymentForTheEntirePeriod() {
        Client client = new Client("Bob", "Bobow", 750_000, 9.5, 60);
        //arrange
        double expected = 194_931.11;
        //act
        double result = sut.CalculationOfOverpaymentForTheEntirePeriod(client);
        //assert
        assertEquals(expected, result);
    }
}
