package problems.generics.aidrivenresume;

class Resume<T extends JobRole> {
    T jobRole;

    Resume(T jobRole) {
        this.jobRole = jobRole;
    }

    void process(String resumeDetails) {
        jobRole.processResume(resumeDetails);
    }
}

