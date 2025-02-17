package problems.annotations.overrideannotation;

public class Dog extends Animal{
    @Override
    public void makeSound() {
        System.out.println("dog sound.....");
    }
}
