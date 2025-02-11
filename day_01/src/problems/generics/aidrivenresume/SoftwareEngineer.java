package problems.generics.aidrivenresume;


class SoftwareEngineer extends JobRole {
    SoftwareEngineer() {
        super("Software Engineer");
    }

    @Override
    void processResume(String resume) {
        System.out.println("Processing resume for Software Engineer: " + resume);
    }
}