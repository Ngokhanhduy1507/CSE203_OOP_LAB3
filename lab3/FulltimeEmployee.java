/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab3;
/**
 *
 * @author Admin
 */
public class FulltimeEmployee extends Employee {
    float salary;
    
    public FulltimeEmployee(float salary,String employeeID, String employeeName,int yearOfBirth, String address, String phone) {
        super(employeeID, employeeName, yearOfBirth, address, phone);
        this.salary = salary;
    }
    
    public float getsalary() {
        return salary;
    }
    
    public void setsalary(float salary) {
        this.salary = salary;
    }
    public FulltimeEmployee(float salary) {
        this.salary= salary;
    }
    
    public String getInfor() {
        return this.toString();
    }
    
    public float getPayment() {
        return salary;
    }
    
    public String toString() {
        return super.toString() + " Full time employee{" + " salary=" + salary+ '}';
    }
}