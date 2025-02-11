package problems.generics.universitycoursemanagement;
import java.util.List;
public class UniversityCourseManagement {

    public static void displayCourses(List<? extends CourseType> courses){
        for(CourseType ct : courses){
            System.out.println("---------------------------------------------------------------------");
            System.out.println("Type of Evalution : "+ct.getEvaluationMethod());
        }
    }
    public static void main(String[] args) {
        Course<ExamCourse> ce = new Course<>("Science", new ExamCourse());
        Course<AssignmentCourse> ca = new Course<>("Java",new AssignmentCourse());
        Course<ResearchCourse> cr =  new Course<>("Data Sets", new ResearchCourse());
        ce.displayCourseDetails();
        ca.displayCourseDetails();
        cr.displayCourseDetails();
        System.out.println("==== Displaying All Course Evaluation Methods ====");
        List<CourseType> allCourses = List.of(ce.getCourseType(), ca.getCourseType(), cr.getCourseType());
        displayCourses(allCourses);
    }
}
