package reflection.intermediatelevel.retrieveannotations;
import java.lang.annotation.Annotation;

public class AnnotationRetriever {

    public static void retrieveAuthor(Class<?> clazz) {
        if (clazz.isAnnotationPresent(Author.class)) {
            Author author = clazz.getAnnotation(Author.class);
            System.out.println("Author: " + author.name());
        } else {
            System.out.println("No Author annotation found.");
        }
    }
}

