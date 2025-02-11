package problems.generics.aidrivenresume;

abstract class JobRole {
    String roleName;

    JobRole(String roleName) {
        this.roleName = roleName;
    }

    abstract void processResume(String resume);
}