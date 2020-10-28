package com.kodilla.bank.homework;

public class CashMachine {

    /*
    Ma ona zawierać tablicę ze zrealizowanymi transakcjami
    (liczbowa wartość dodatnia, jeśli użytkownik wpłacił pieniądze,
    ujemna jeśli użytkownik wypłacił pieniądze).
    Dodaj metody zwracające saldo bankomatu oraz
    liczbę wykonanych transakcji.
     */

    private int[] transactions;     //tablica z transakcjami
    private int size;               //rozmiar tablicy


    public int[] getTransactions() {
        return transactions;
    }

    public int getSize() {
        return size;
    }

    public CashMachine() {
        this.transactions = new int[0];     //zadeklarowanie pustej tablicy
        this.size = 0;                      //nie zawierającej żadnych indeksów
    }


    public int getBalance() {               //zwracanie salda (kwoty) znajdującej się w bankomacie
        int sum = 0;
        for (int i = 0; i < transactions.length; i++) {
            sum = sum + transactions[i];
        }
        return sum;
    }

    /*
    metoda dodająca kwoty (wpłacane i wypłacane) z bankomatu do tablicy transakcji.
    W przypadku gdy kwota pieniędzy (saldo plus kwota w bankomacie) w bankomacie jest < 0 - bankomat zwróci komunikat o braku środków.
    W przypadku wykonania nowej transakcji tablica 'transactions' zostanie zastąpiona nową (większą o jeden indeks) i kwota ostatniej transakcji
    zostanie dodana jako nowy indeks do tablicy.
     */

    public void addTransaction(int amount) {
        if ((getBalance() + amount) >= 0) {
            this.size++;
            int[] newTab = new int[this.size];
            System.arraycopy(transactions, 0, newTab, 0, transactions.length);
            newTab[this.size - 1] = amount;
            this.transactions = newTab;
        } else {
            System.out.println("You are unable to withdraw money from ATM now. No sufficient funds in the ATM at the moment.");
        }
    }

    /*
    metoda określająca liczbę transakcji związanych w wypłatą pieniędzy
     */

    public int getNumberOfWithdrawals() {
        int count = 0;
        for (int i = 0; i < transactions.length; i++) {
            if (transactions[i] < 0) {
                count++;
            }
        }
        return count;
    }

    /*
    metoda zliczająca ilość transkacji związanych z wpłatą pieniędzy do bankomatu
     */

    public int getNumberOfDeposits() {
        int count = 0;
        for (int i = 0; i < transactions.length; i++) {
            if (transactions[i] > 0) ;
            count++;
        }
        return count;
    }

    /*
    metoda obliczająca średnią wartość wypłaty z bankomatu
     */

    public double getAverageValueOfWithdrawals() {
        if (transactions.length == 0 || getNumberOfWithdrawals() == 0) {
            return 0;
        }
        double sum = 0;
        for (int i = 0; i < transactions.length; i++) {
            if (transactions[i] < 0) {
                sum += transactions[i];
            }
        }
        return sum / getNumberOfWithdrawals();
    }

    /*
    metoda obliczająca średnią wartość wpłaty do bankomatu
     */

    public double getAverageValueOfDeposits() {
        if (transactions.length == 0 || getNumberOfDeposits() == 0) {
            return 0;
        }
        double sum = 0;
        for (int i = 0; i < transactions.length; i++) {
            if (transactions[i] > 0) {
                sum += transactions[i];
            }
        }
        return sum / getNumberOfDeposits();
    }
}
