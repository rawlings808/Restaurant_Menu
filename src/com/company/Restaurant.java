package com.company;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class Restaurant {

    public static void main(String[] args) {
	// write your code here
        Date today = Calendar.getInstance().getTime();
        MenuItem newItem1 = new MenuItem(30.99, "Garlic linguine", "Tasty noodles with a garlic butter sauce", new Date(), "Dinner", true);
        MenuItem newItem2 = new MenuItem(25.99, "Fettucicine", "Flat noodles with a garlic butter sauce", new Date(), "Dinner", true);
        MenuItem newItem3 = new MenuItem(10.99, "Toasted Ravioli", "BBQ-Burnt-End Stuffed Ravioli, breaded and deep fried, with a yummy sauce", new Date(), "Appetizer", true);

    ArrayList <MenuItem> startingMenu = new ArrayList<>();

    Menu ourLaunchMenu = new Menu(today, startingMenu);

    ourLaunchMenu.addItem(newItem1);
    ourLaunchMenu.addItem(newItem3);
    ourLaunchMenu.addItem(newItem2);

    ourLaunchMenu.printMenu();

    ourLaunchMenu.removeItem(newItem1);
    ourLaunchMenu.printMenu();


    }

}
