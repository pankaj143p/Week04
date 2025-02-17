package problems.annotations.repeatableannotation;

import java.lang.annotation.*;

@Repeatable(BugReports.class)
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface BugReport {
    String description() default "tbd";
}
