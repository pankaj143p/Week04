/*
 Dynamic Online Marketplace
Concepts: Type Parameters, Generic Methods, Bounded Type Parameters
Problem Statement:
Build a generic product catalog for an online marketplace that supports various product types like Books,
Clothing, and Gadgets. Each product type has a specific price range and category.

Hints:
Define a generic class Product<T> where T is restricted to a category (BookCategory, ClothingCategory, etc.).
Implement a generic method to apply discounts dynamically (<T extends Product> void applyDiscount
(T product, double percentage)).
Ensure type safety while allowing multiple product categories to exist in the same catalog.
 */

interface ProductCategory {
    String getCategoryDetails();
}
class BookCategory implements ProductCategory {
    private String genre;
    public BookCategory(String genre)
    {
        this.genre = genre;
    }
    public String getGenre() {
        return genre;
    }
    @Override
    public String getCategoryDetails() {
        return "genre : " + genre;
    }
}
class ClothingCategory implements ProductCategory {
    private String size;
    public ClothingCategory(String size)
    {
        this.size = size;
    }
    public String getSize()
    {
        return size;
    }
    @Override
    public String getCategoryDetails() {
        return "Size: " + size;
    }
}
class GadgetsCategory implements ProductCategory {
    private String brand;
    public GadgetsCategory(String brand) {
        this.brand = brand;
    }
    public String getBrand() {
        return brand;
    }
    @Override
    public String getCategoryDetails() {
        return "Brand: " + brand;
    }
}
class Product<T extends ProductCategory> {
    private String name;
    private double price;
    private T category;
    public Product(String name, double price, T category) {
        this.name = name;
        this.price = price;
        this.category = category;
    }
    public String getName() {
        return name;
    }
    public double getPrice() {
        return price;
    }
    public T getCategory() {
        return category;
    }
    public void setPrice(double price) {
        this.price = price;
    }


    public void displayAll() {
        System.out.println("Product Name : "+name);
        System.out.println("Price : "+price);
        System.out.println("Category : "+category.getCategoryDetails());
    }
}
class Marketplace {
    public static <T extends ProductCategory> void applyDiscount(Product<T> product, double percentage) {
        double price = product.getPrice();
        double discount = price * (percentage / 100);
        double newPrice = price - discount;
        product.setPrice(newPrice);
        System.out.println("Applied " + percentage + "% discount. New price: " + newPrice);
    }
}
public class OnlineMarketPlace {
    public static void main(String[] args) {
        BookCategory bookCategory = new BookCategory("Fantasy");
        ClothingCategory clothingCategory = new ClothingCategory("M");
        Product<BookCategory> book = new Product<>("The Hobbit", 20.0, bookCategory);
        Product<ClothingCategory> tShirt = new Product<>("T-shirt", 15.0, clothingCategory);
        System.out.println("Before discount : ");
        System.out.println();
        book.displayAll();
        tShirt.displayAll();
        System.out.println("discount : ");
        System.out.println();
        Marketplace.applyDiscount(book, 10);
        Marketplace.applyDiscount(tShirt, 20);
        System.out.println("After giving discount : ");
        book.displayAll();
        tShirt.displayAll();
    }
}
