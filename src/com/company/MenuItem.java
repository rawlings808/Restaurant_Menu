package com.company;

import java.util.Date;

public class MenuItem {

    private double price;
    private String name;
    private String description;
    private Date whenAdded;
    private String category;
    private boolean isNew;


    public MenuItem(double price, String name, String description, Date whenAdded, String category, boolean isNew) {
        this.price = price;
        this.name = name;
        this.description = description;
        this.whenAdded = whenAdded;
        this.category = category;
        this.isNew = isNew;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getWhenAdded() {
        return whenAdded;
    }

    public void setWhenAdded(Date whenAdded) {
        this.whenAdded = whenAdded;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public boolean isNew() {
        return isNew;
    }

    public void setNew(boolean aNew) {
        isNew = aNew;
    }
}