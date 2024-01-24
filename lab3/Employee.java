/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab3;
/**
 *
 * @author Admin
 */

    public abstract class Employee {

    String employeeID;
    String employeeName;
    int yearOfBirth;
    String address;
    String phone;

    public Employee(String employeeID, String employeeName,int yearOfBirth, String address, String phone ) {
        this.employeeName = employeeName;
        this.employeeID = employeeID;
        this.yearOfBirth = yearOfBirth;
        this.address= address;
        this.phone = phone;
        
    }
    public Employee() {
    
    }
    
    public String getemployeeID() {
        return employeeID;
    }
    
    public void setemployeeID(String employeeID) {
        this.employeeID = employeeID;
    }
    
    public String getemployeeName() {
        return employeeName;
    }
    
    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }
    
    public int getyearOfBirth() {
        return yearOfBirth;
    }
    
    public void setyearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }
    
    public String getaddress() {
        return address;
    }
    
    public void setaddress (String address) {
        this.address = address;
    }
    
    public String getphone() {
        return phone;
    }
    
    public void setphone(String phone) {
        this.phone = phone;
    }
    
    @Override
    public String toString() {
        return "Employee{" + "employee ID = " + employeeID + ", employee name = " + employeeName + ", year of birth = " + yearOfBirth + ",address = " + address + ", phone = " +phone;
    }
    
    public abstract String getInfor();
    public abstract float getPayment();
    
}

