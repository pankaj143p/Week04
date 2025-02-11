package problems.generics.onlinemarketplcae;/*
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
