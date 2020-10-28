package com.kodilla.bank.homework;

public class Bank {
    private CashMachine[] cashMachines;
    private int numberOfCashMachines;

    public Bank(int numberOfCashMachines){
        this.numberOfCashMachines = numberOfCashMachines;
        this.cashMachines = new CashMachine[numberOfCashMachines];

        for(int i=0; i<cashMachines.length; i++){
            cashMachines[i] = new CashMachine();
        }
    }

    public int getNumberOfCashMachines(){
        return numberOfCashMachines;
    }

    public void addTransaction(int deviceNumber, int amount){
        if(deviceNumber < cashMachines.length) {
            cashMachines[deviceNumber].addTransaction(amount);
        }
    }

    public int getTotalBalance() {      //całkowite saldo
        int sum = 0;
        for(int i = 0; i<cashMachines.length; i++){
            sum = sum + cashMachines[i].getBalance();
        }
        return sum;
    }

    public int getTotalNumberOfDeposits() {     //całkowita liczba wykonanych wpłat
        int sum = 0;
        for(int i = 0; i<cashMachines.length; i++){
            sum = sum + cashMachines[i].getNumberOfDeposits();
        }
        return sum;
    }

    public int getTotalNumberOfWithdrawals() {      //całkowita loczba wykonanych wypłat
        int sum = 0;
        for(int i = 0; i<cashMachines.length; i++){
            sum = sum + cashMachines[i].getNumberOfWithdrawals();
        }
        return sum;
    }

    public double getTotalAvgValueOfDeposits() {        //całkowita średnia wartość wpłat
        if(this.cashMachines.length==0) {
            return 0;
        }
        double sum = 0;
        for(int i = 0; i<cashMachines.length; i++){
            sum = sum + cashMachines[i].getAverageValueOfDeposits();
        }
        return sum/cashMachines.length;
    }



    public double getTotalAvgValueOfWithdrawals() {     //całkowita średnia wartość wypłat
        if(this.cashMachines.length==0) {
            return 0;
        }
        double sum = 0;
        for(int i = 0; i<cashMachines.length; i++){
            sum = sum + cashMachines[i].getAverageValueOfWithdrawals();
        }
        return (sum/cashMachines.length);
    }
}