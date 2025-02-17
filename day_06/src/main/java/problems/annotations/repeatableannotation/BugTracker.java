package problems.annotations.repeatableannotation;

import java.lang.reflect.Method;
/*
Exercise 5: Create and Use a Repeatable Annotation
✅ Problem Statement:
Define an annotation @BugReport that can be applied multiple times on a method.
🔹 Steps to Follow:
Define @BugReport with a description field.
Use @Repeatable to allow multiple bug reports.
Apply it twice on a method.
Retrieve and print all bug reports.

 */
public class BugTracker {

    @BugReport(description = "null pointer exception")
    @BugReport(description = "arithmetic exception")

    public void performTask(){

    }
    public static void main(String[] args) throws NoSuchMethodException {
       BugTracker bt = new BugTracker();
       Method m = bt.getClass().getMethod("performTask");
       if(m.isAnnotationPresent(BugReports.class)){
           BugReports br = m.getAnnotation(BugReports.class);
           for(BugReport brit : br.value()){
               System.out.println("Bug Report: "+brit.description());
           }
       }
    }
}
