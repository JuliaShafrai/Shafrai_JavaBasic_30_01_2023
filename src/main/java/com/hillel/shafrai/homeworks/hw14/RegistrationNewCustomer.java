package com.hillel.shafrai.homeworks.hw14;

public class RegistrationNewCustomer {
    private final String name;
    private final String phoneNumber;
    private final int birthdayDay;
    private final int birthdayMonth;
    private int birthdayYear;
    private final String email;

    private String surname;
    private double weight;
    private final String pressure;
    private int steps;

    private final int age = 2020 - birthdayYear;

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public int getBirthdayDay() {
        return birthdayDay;
    }

    public int getBirthdayMonth() {
        return birthdayMonth;
    }

    public int getBirthdayYear() {
        return birthdayYear;
    }

    public String getEmail() {
        return email;
    }

    public int getAge() {
        return age;
    }

    public String getSurname() {
        return surname;
    }

    public double getWeight() {
        return weight;
    }

    public String getPressure() {
        return pressure;
    }

    public int getSteps() {
        return steps;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setSteps(int steps) {
        this.steps = steps;
    }

    RegistrationNewCustomer(String name, String phoneNumber, int birthdayDay, int birthdayMonth, int birthdayYear,
                            String email, String surname, double weight, String pressure, int steps) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.birthdayDay = birthdayDay;
        this.birthdayMonth = birthdayMonth;
        this.birthdayYear = birthdayYear;
        this.email = email;
        this.surname = surname;
        this.weight = weight;
        this.pressure = pressure;
        this.steps = steps;
    }

    public void printAccountInfo(){

        System.out.println("User date: " + getName() + " " + getSurname() + ", phone: " + getPhoneNumber() +
                ", birthday: " + getBirthdayDay() + "/" + getBirthdayMonth() + "/" + getBirthdayYear() +
                ", age: "+ getAge() + ", mail: " + getEmail() + ", weight: "+ getWeight() + ", pressure: "
                + getPressure() + ", number of steps: " + getSteps());
    }
}

