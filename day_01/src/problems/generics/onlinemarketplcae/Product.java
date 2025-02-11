package problems.generics.onlinemarketplcae;

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