package com.kodilla.bank;

import com.kodilla.bank.homework.CashMachine;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CashMachineTestSuite {

    @Test
    public void shouldHaveZeroLength() {        //kiedy tablica jest pusta - zero transakcji
        CashMachine cashMachine = new CashMachine();
        int[] transactions = cashMachine.getTransactions();
        assertEquals(0, transactions.length);
    }

    @Test
    public void shouldReturnZeroIfBalanceIsEqualToZero() {    //kiedy saldo jest równe zero
        CashMachine cashMachine = new CashMachine();
        cashMachine.addTransaction(50);
        cashMachine.addTransaction(-50);
        assertEquals(0, cashMachine.getBalance());
    }

    @Test
    public void shouldReturnPositiveValuesIfBalanceIsAboveZero() {    //kiedy saldo jest wieksze niż zero
        CashMachine cashMachine = new CashMachine();
        cashMachine.addTransaction(50);
        cashMachine.addTransaction(50);
        assertEquals(100, cashMachine.getBalance());
    }

    @Test
    public void shouldReturnAverageValueOfWithdrawalsEqualToZeroIfNoWithdrawals() {    //kiedy nie było wypłat, średnia wypłat = 0
        CashMachine cashMachine = new CashMachine();
        cashMachine.addTransaction(50);
        cashMachine.addTransaction(50);
        assertEquals(0, cashMachine.getAverageValueOfWithdrawals());
    }

    @Test
    public void shouldReturnAverageValueOfDepositsEqualToZeroIfNoDeposits() {    //kiedy nie było wpłat, średnia wpłat = 0
        CashMachine cashMachine = new CashMachine();
        cashMachine.addTransaction(-50);
        cashMachine.addTransaction(-50);
        assertEquals(0, cashMachine.getAverageValueOfDeposits());
    }

    @Test
    public void shouldReturnAverageValueOfDepositsEqualToZeroIfNoDepositsWereMade() {    //kiedy nie było żadnych transkacji, liczba transkacji = 0
        CashMachine cashMachine = new CashMachine();
        assertEquals(0, cashMachine.getAverageValueOfDeposits(), 0.01);
    }
}
