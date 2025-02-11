package problems.generics.onlinemarketplcae;

class Marketplace {
    public static <T extends ProductCategory> void applyDiscount(Product<T> product, double percentage) {
        double price = product.getPrice();
        double discount = price * (percentage / 100);
        double newPrice = price - discount;
        product.setPrice(newPrice);
        System.out.println("Applied " + percentage + "% discount. New price: " + newPrice);
    }
}