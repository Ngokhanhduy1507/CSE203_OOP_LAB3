/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab3;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Q1_CD {
   
     private int cdID;
    private String collection;
    private String type;
    private String title;
    private double price;
    private int yearOfrelease;

    public Q1_CD(int cdID, String collection, String type, String title, double price, int yearOfrelease) {
        this.cdID = cdID;
        this.collection = collection;
        this.type = type;
        this.title = title;
        this.price = price;
        this.yearOfrelease = yearOfrelease;
    }
    
    public int getcdID() {
        return cdID;
    }
    
    

    public String getcollection() {
        return collection;
    }

    public void setCollection(String collection) {
        this.collection = collection;
    }
    
    public String gettype() {
        return type;
    }
    
    public void setType(String type) {
        this.type = type;
    }

    public String gettitle() {
        return title;
    }
    
    public void settitle(String title) {
        this.title = title;
    }
    
    public double getprice() {
        return price;
    }
    
    public void setPrice (double price) {
        this.price = price;
    }

    public int getyearOfrelease() {
        return yearOfrelease;
    }
    
    public void setYearOfrelease(int yearOfrelease) {
        this.yearOfrelease = yearOfrelease;
    }
    
    @Override
    public String toString() {
        return "CD{" + "cd_ID= " + cdID + ", collection= " + collection + ", type= "+ type + ", title = " + title +", Price= " + price + ", yearOfrelease =" + yearOfrelease + "}";     
    }
    
    public void addCD() {
        Scanner sc = new Scanner (System.in);
        System.out.println("\nAdd CD");
        System.out.print("Enter CD ID : ");
        cdID = sc.nextInt();
        sc.nextLine();

        // check CD id 
        System.out.print("Enter CD collection (game/movie/music)");
        collection = sc.next();

        System.out.print("Enter CD type (audio/video");
        type = sc.next();

        System.out.print("Enter CD title");
        title = sc.next();

        System.out.print("Enter CD price");
        price = sc.nextDouble();

        System.out.print("Enter the year of release");
        yearOfrelease = sc.nextInt();

    }   
}



