package org.launchcode;

import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;
import java.util.Date;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Date lastUpdate;
        MenuItem pasta = new MenuItem(20.0, "Pasta", "Main Course", true);
        MenuItem steak = new MenuItem(30.0, "RibEye", "Main Course", false);
        MenuItem iceCream = new MenuItem(10.0, "Vanilla", "Dessert", false);
        MenuItem nachos = new MenuItem(8.0, "Chips and Cheese", "Appetizer", true);
        System.out.println(pasta.getDescription());
        System.out.println(pasta.isNew());
        Menu
    }

}
