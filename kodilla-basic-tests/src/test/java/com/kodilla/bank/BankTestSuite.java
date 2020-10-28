package com.kodilla.bank;

import com.kodilla.bank.homework.Bank;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BankTestSuite {


    @Test
    public void shouldReturnNumberOfDevices(){      //testowanie ilości bankomatów
        Bank bank = new Bank(2);
        assertEquals(2, bank.getNumberOfCashMachines());
    }

    @Test
    public void shouldReturnZeroIfTotalBalanceIsEqualToZero(){     //testowanie salda gdy wynosi zero
        Bank bank = new Bank(2);

        bank.addTransaction(0, 50);
        bank.addTransaction(0, 100);
        bank.addTransaction(0, -50);
        bank.addTransaction(0, -100);

        bank.addTransaction(1, 100);
        bank.addTransaction(1, -100);
        bank.addTransaction(1, 100);
        bank.addTransaction(1, -100);

        assertEquals(0, bank.getTotalBalance());
    }

    @Test
    public void shouldReturnZeroIfTotalNumberOfDepositsIsEqualToZero(){     //testowanie gdy całkowita liczba wpłat wynosi zero
        Bank bank = new Bank(2);

        bank.addTransaction(0, -10);
        bank.addTransaction(0, -100);
        bank.addTransaction(0, -50);
        bank.addTransaction(0, -100);

        bank.addTransaction(1, -100);
        bank.addTransaction(1, -100);
        bank.addTransaction(1, -100);
        bank.addTransaction(1, -100);

        assertEquals(0, bank.getTotalNumberOfDeposits());
    }

    @Test
    public void shouldReturnZeroIfTotalNumberOfWithdrawalsIsEqualToZero(){     //testowanie gdy całkowita liczba wypłat wynosi zero
        Bank bank = new Bank(2);

        bank.addTransaction(0, 10);
        bank.addTransaction(0, 100);
        bank.addTransaction(0, 50);
        bank.addTransaction(0, 100);

        bank.addTransaction(1, 100);
        bank.addTransaction(1, 100);
        bank.addTransaction(1, 100);
        bank.addTransaction(1, 100);

        assertEquals(0, bank.getTotalNumberOfWithdrawals());
    }

    @Test
    public void shouldReturnZeroIfTotalAverageValueOfWithdrawalsIsEqualToZero(){     //testowanie gdy całkowita wartość wypłat wynosi zero
        Bank bank = new Bank(2);

        bank.addTransaction(0, 10);
        bank.addTransaction(0, 100);
        bank.addTransaction(0, 50);
        bank.addTransaction(0, 100);

        bank.addTransaction(1, 100);
        bank.addTransaction(1, 100);
        bank.addTransaction(1, 100);
        bank.addTransaction(1, 100);

        assertEquals(0, bank.getTotalAvgValueOfWithdrawals());
    }

    @Test
    public void shouldReturnZeroIfTotalAverageValueOfDepositsIsEqualToZero(){     //testowanie gdy całkowita wartość wpłat wynosi zero
        Bank bank = new Bank(2);

        bank.addTransaction(0, -10);
        bank.addTransaction(0, -100);
        bank.addTransaction(0, -50);
        bank.addTransaction(0, -100);

        bank.addTransaction(1, -100);
        bank.addTransaction(1, -100);
        bank.addTransaction(1, -100);
        bank.addTransaction(1, -100);

        assertEquals(0, bank.getTotalAvgValueOfDeposits());
    }

}
