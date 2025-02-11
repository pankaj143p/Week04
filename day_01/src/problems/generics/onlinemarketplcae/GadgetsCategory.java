package problems.generics.onlinemarketplcae;

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