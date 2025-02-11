package problems.generics.onlinemarketplcae;

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