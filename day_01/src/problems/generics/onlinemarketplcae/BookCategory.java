package problems.generics.onlinemarketplcae;

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
