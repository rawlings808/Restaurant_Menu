package com.company;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Date;

public class Menu {
    private Date lastUpdated;
    private ArrayList<MenuItem> items;

    public Menu(Date lastUpdated, ArrayList<MenuItem> items) {
        this.lastUpdated = lastUpdated;
        this.items = items;
    }

    public Date getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public ArrayList<MenuItem> getItems() {
        return items;
    }

    public void setItems(ArrayList<MenuItem> items) {
        this.items = items;
    }

    public ArrayList<MenuItem> addItem(MenuItem item) {
        for (int i = 0; i < items.size(); i++){
            if (items.get(i).equals(item)){
                System.out.println(item.getName() + " is already on the menu!");
                return this.items;
            }
        }
        this.items.add(item);
        return this.items;
    }

    public ArrayList<MenuItem> removeItem(MenuItem item){
        int toBeRemoved = -1;
        for (int i = 0; i < items.size(); i++){
            if (items.get(i).equals(item)){
                toBeRemoved = i;
            }
        }
        this.items.remove(toBeRemoved);
        return this.items;
    }

    public String menuUpdated() {
        return ("The menu was last updated on " + this.lastUpdated);
    }

    public void printItem(MenuItem item){
        System.out.println(item.getDescription());
    }

    public void printMenu(){
        for (int i = 0; i < items.size(); i++){
            System.out.println(items.get(i).getName() +": " + items.get(i).getDescription() +". "+ items.get(i).getPrice());
        }

    }

}
