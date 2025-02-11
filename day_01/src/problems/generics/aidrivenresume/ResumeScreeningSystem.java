package problems.generics.aidrivenresume;
import java.util.List;
public class ResumeScreeningSystem {

    public static void processResumes(List<? extends JobRole> jobRoles, String resumeDetails) {
        for (JobRole jobRole : jobRoles) {
            jobRole.processResume(resumeDetails);
        }
    }

    public static void main(String[] args) {
        SoftwareEngineer softwareEngineer = new SoftwareEngineer();
        DataScientist dataScientist = new DataScientist();
        ProductManager productManager = new ProductManager();
        List<JobRole> jobRoles = List.of(softwareEngineer, dataScientist, productManager);
        processResumes(jobRoles, "Pankaj's Resume");
    }
}

