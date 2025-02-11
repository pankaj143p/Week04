/*
   1. Smart WarehouseItem Management System
Concepts: Generic Classes, Bounded Type Parameters, Wildcards
Problem Statement:
You are developing a Smart WarehouseItem System that manages different types of items like Electronics, Groceries, and Furniture. The system should be able to store and retrieve items dynamically while maintaining type safety.
Hints:
Create an abstract class WarehouseItemItem that all items extend (Electronics, Groceries, Furniture).
Implement a generic class Storage<T extends WarehouseItemItem> to store items safely.
Implement a wildcard method to display all items in storage regardless of their type (List<? extends WarehouseItemItem>).

 */

package problems.generics;

import java.util.ArrayList;

abstract class WarehouseItem{
    private String itemName;
    private int itemId;

    public WarehouseItem(String itemName, int itemId) {
        this.itemName = itemName;
        this.itemId = itemId;
    }

    public String getItemName() {
        return itemName;
    }

    public int getItemId() {
        return itemId;
    }
    public abstract void displayAll();
}

class Electronics extends WarehouseItem{
    private String brand;
    public Electronics(String itemName, int itemId, String brand) {
        super(itemName, itemId);
        this.brand = brand;
    }
    @Override
    public void displayAll() {
        System.out.println("Electronics - Name: " + getItemName());
        System.out.println("ID: " + getItemId());
        System.out.println("Brand: " + brand);
    }
}


class Groceries extends WarehouseItem{
    private String brand;
    private String category;

    public Groceries(String itemName, int itemId, String category) {
        super(itemName, itemId);
        this.category = category;
    }
    @Override
    public void displayAll() {
        System.out.println("Groceries - Name: " + getItemName());
        System.out.println("ID: " + getItemId());
        System.out.println("category: " + category);
    }
}


class Furniture extends WarehouseItem{
    private String material;

    public Furniture(String itemName, int itemId, String material) {
        super(itemName, itemId);
        this.material = material;
    }
    @Override
    public void displayAll() {
        System.out.println("Furnitures - Name: " + getItemName());
        System.out.println ("ID: " + getItemId());
        System.out.println("used material: " + material);
    }
}


class Storage <T extends WarehouseItem>{
    ArrayList<T> itemsList;

    public Storage() {
        itemsList = new ArrayList<>();
    }

    public void add(T item){
        itemsList.add(item);
    }

    public T getItem(int idx){
        return itemsList.get(idx);
    }

    public void displayItemsList(ArrayList<? extends WarehouseItem> listOfItems) {
        for (WarehouseItem item : listOfItems) {
            System.out.println("--------------------------------------------------------------------------------------------------");
           item.displayAll();
        }
    }
}

class WarehouseItemManagement{
    public static void main(String[] args) {
        Electronics electronics1 = new Electronics("Smartphone", 101, "Samsung");
        Groceries groceries1 = new Groceries("Milk", 201, "24-11-2026");
        Furniture furniture1 = new Furniture("Chair", 301, "Wood");

        // Create a Storage object for WarehouseItemItems
        Storage<WarehouseItem> storage = new Storage<>();

        // Add items to the storage
        storage.add(electronics1);
        storage.add(groceries1);
        storage.add(furniture1);

        // Display all items using wildcard method
        ArrayList<WarehouseItem> allItems = new ArrayList<>();
        allItems.add(electronics1);
        allItems.add(groceries1);
        allItems.add(furniture1);

        storage.displayItemsList(allItems);
    }
}