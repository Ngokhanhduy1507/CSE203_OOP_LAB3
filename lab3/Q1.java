/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab3;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author
 */
public class Q1 {

//        private static Scanner sc = new Scanner (System.in);
    //add list CD title
    //search CD by CD title
    static Scanner sc = new Scanner(System.in);
    private static Object list;

    public static void main(String[] args) {

        int menu;
        Scanner sc = new Scanner(System.in);
        

        do {
            System.out.printf("1. Add CD (ArrayList)\n"
                    + "2. Search CD by CD title\n"
                    + "3. Search CDs by collection (game/movie/music)\n"
                    + "4. Search CDs by type (audio/video)\n"
                    + "5. Delete CD by CD Id\n"
                    + "6. Edit CD information by Id\n"
                    + "7. Display all CDs\n"
                    + "8. Sort the CD list ascending by year of release\n"
                    + "9. Exit\ninput: ");
            menu = sc.nextInt();
            switch (menu) {
                case 1:
                    //add CD (ArrayList)
                    addCD();
                    break;

                case 2:
                    displayCD(Searchbytitle());
                    break;
                case 3:
                    displayCD(Searchbycollection());
                    break;

                case 4:
                    displayCD(Searchbytype());
                    break;

                case 5:
                    deleteCD();
                    break;

                case 6:
                    UpdateCD();
                    break;

                case 7:
                    displayAllCD();
                    break;

                case 8:
                    sort();
                    break;
                case 9:
                    System.out.println("exit");
                    break;
                default:
                    System.out.println("Wrong input");
            }
        } while (menu != 9);
    }
    private static ArrayList<Q1_CD> cdCatalogue = new ArrayList<Q1_CD>();

    public static void addCD() {
        list.add(inputCD);
    }

    public static CD inputCD() {
        System.out.println("CD ID : ");
        String ID = sc.next();

        System.out.println("CD collection : ");
        String collection = sc.next();

        System.out.println("CD type : ");
        String type = sc.next();

        System.out.println("CD title : ");
        String title = sc.nextLine();

        System.out.println("CD price : ");
        double price = sc.nextDouble();

        System.out.println("CD yearOfrelease : ");
        int year = sc.nextInt();
        return new CD(ID, collection, type, title, price, year);
    }

    public static void displayCD(ArrayList<Q1_CD> arr) {
        for (int i = 0; i < arr.size(); i++) {
            System.out.println(arr.get(i).toString());
        }
    }

    public static ArrayList<Q1_CD> Searchbytitle() {
        System.out.println("Enter the title");
        String title = sc.nextLine();

        ArrayList<Q1_CD> result = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            CD show;
            show = list.Get(i);
            if (show.gettitle().equalsIgnoreCase(title)) {
                result.add(show);
            }
        }
        return result;
    }

    public static ArrayList<Q1_CD> Searchbytype() {
        System.out.println("Enter the type");
        String type = sc.nextLine();

        ArrayList<Q1_CD> result = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            CD show = list.get(i);
            if (show.gettitle().equalsIgnoreCase(type)) {
                result.add(show);
            }
        }
        return result;
    }

    public static void deleteCD() {
        System.out.println("Enter the ID");
        String ID = sc.next();

        for (int i = 0; i < list.size(); i++) {
            CD show = list.get(i);
            if (show.getcdID().equalsIgnoreCase(id)) {
                System.out.println("remove : " + show.toString());
                list.remove(show);
            }
        }

    }

    public static void UpdateCD() {
        System.out.println("CD ID : ");
        String ID = sc.next();
        for (int i = 0; list.size() >= i; i++) {
            if (list.get(i).getcdID().equalsIgnoreCase(id)) {
                show = list.get(i);
                System.out.println("before Update : " + show.String());
            }
        }
    }
}


    

    
