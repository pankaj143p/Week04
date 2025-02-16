package java.org.junit.advanced;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BankAccountTest {

    @Test
    void testDeposit() {
        BankAccount account = new BankAccount(100);
        account.deposit(50);
        assertEquals(150, account.getBalance());
    }

    @Test
    void testWithdraw() {
        BankAccount account = new BankAccount(200);
        account.withdraw(50);
        assertEquals(150, account.getBalance());
    }

    @Test
    void testWithdrawInsufficientFunds() {
        BankAccount account = new BankAccount(100);
        Exception exception = assertThrows(IllegalArgumentException.class, () -> account.withdraw(200));
        assertEquals("Insufficient funds", exception.getMessage());
    }
}
