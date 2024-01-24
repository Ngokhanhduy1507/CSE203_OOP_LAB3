/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab3;
/**
 *
 * @author Admin
 */
public class ParttimeEmployee extends Employee {
    int Workinghour;
    float payrate;
    float payment;
    
    public ParttimeEmployee(int Workinghour, float payrate) {
        this.Workinghour = Workinghour;
        this.payrate = payrate;
    }
    public String toString() {
        return super.toString() + "ParttimeEmployee{" + "Workinghour" + Workinghour +", payrate = " + payrate + '}';
    }
    public int getWorkinghour() {
        return Workinghour;
    }
    
    public void setWorkinghour(int Workinghour) {
        this.Workinghour = Workinghour;
    }
    
    public float getpayrate() {
        return payrate;
    }
    
    public void setpayrate(float payrate) {
        this.payrate = payrate;
    }
    
    public String getInfor() {
        return this.toString();
    }
    
    public float getPayment() {
        payment = payrate * Workinghour;
        return payment;
    }
    
}