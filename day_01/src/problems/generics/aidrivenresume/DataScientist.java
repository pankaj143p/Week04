package problems.generics.aidrivenresume;

class DataScientist extends JobRole {
    DataScientist() {
        super("Data Scientist");
    }

    @Override
    void processResume(String resume) {
        System.out.println("Processing resume for Data Scientist: " + resume);
    }
}
