package com.company;

public class Employee {
    String name;
    String position;
    String email;
    String phone_number;
    int pay;
    int age;
    boolean vaccine;

    public Employee(String name, String position, String email, String phone_number,int pay,int age, boolean vaccine)
    {
        this.name = name;
        this.position = position;
        this.email = email;
        this.phone_number = phone_number;
        this.pay = pay;
        this.age = age;
        this.vaccine = vaccine;
    }

    public void displayInfo(){

        System.out.printf("Name: %s; Position: %s; Email: %s; Phone number: %s; pay: %d; Age: %d; Vaccine: %b",
                name, position, email, phone_number, pay, age, vaccine);
        System.out.println();
    }

}
