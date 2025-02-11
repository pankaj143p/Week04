package problems.generics.aidrivenresume;

class ProductManager extends JobRole {
    ProductManager() {
        super("Product Manager");
    }

    @Override
    void processResume(String resume) {
        System.out.println("Processing resume for Product Manager: " + resume);
    }
}