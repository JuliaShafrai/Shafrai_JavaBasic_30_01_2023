package com.hillel.shafrai.homeworks.hw14;

public class Main {
    public static void main(String[] args) {
        RegistrationNewCustomer newCustomer1 = new RegistrationNewCustomer("Julia", "524", 26,
                11, 2002, "ysharai@gmail.com", "Shafrai", 53.5, "120/60",
                3000);

        RegistrationNewCustomer newCustomer2 = new RegistrationNewCustomer("Helen", "45856",
                22,6, 1968, "hshafrai@gmail.com", "Shafrai", 75.5,
                "130/80", 5000);

        RegistrationNewCustomer newCustomer3 = new RegistrationNewCustomer("Alina", "96857435",
                10,10, 1988, "Aliluky@gmail.com", "Lukyanenko", 67.3,
                "120/60", 2000);

        newCustomer1.printAccountInfo();
        newCustomer2.printAccountInfo();
        newCustomer3.printAccountInfo();
        System.out.println();

        newCustomer2.setSurname("Shafrai");
        newCustomer2.setSteps(2500);

        newCustomer3.setSteps(10000);
        newCustomer3.setWeight(60);

        newCustomer2.printAccountInfo();
        newCustomer3.printAccountInfo();
    }
}



