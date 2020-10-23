package com.kodilla.abstracts.homework;

public abstract class Job {

    /*
    definicja pól (zmiennych)
     */

    private int salary;
    private String responsibilities;


    /*
    definicja getter'ów
     */

    public int getSalary() {
        return salary;
    }
    public String getResponsibilities() {
        return responsibilities;
    }

    /*
    deklaracja konstruktora 'Job'
     */

    public Job (int salary, String responsibilities) {
        this.salary = salary;
        this.responsibilities = responsibilities;
    }
}
