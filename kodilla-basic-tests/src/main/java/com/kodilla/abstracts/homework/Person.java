package com.kodilla.abstracts.homework;

public class Person {

    public String firstName;
    public int age;
    private Job job;

    public Person (String firstName, int age, Job job) {
        this.firstName = firstName;
        this.age = age;
        this.job = job;
    }

    public String getFirstName() {
        return firstName;
    }
    public int getAge() {
        return age;
    }
    public Job getJob() {
        return job;
    }

    public static void main(String[] args) {
        Person person = new Person("John", 105, new Driver(5000, "extremely high"));
        System.out.println("His/Her name is " + person.getFirstName() + " and is " + person.getAge()+ " years old." + "\nHe/She works as a " + person.getJob().getClass().getSimpleName() + " and this profession has an " + person.getJob().getResponsibilities() + " level of responsibility,\nand that is why she/he earns " + person.getJob().getSalary() + " USD.");
    }
}
