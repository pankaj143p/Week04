package problems.annotations.lagacyapi;

 class LegacyAPI {

    @Deprecated
    public void oldFeature() {
        System.out.println("This is the old feature.");
    }
    public void newFeature() {
        System.out.println("This is the new feature.");
    }
    public static void main(String[] args) {

        LegacyAPI api = new LegacyAPI();
        api.oldFeature();  // This will show a warning
        api.newFeature();  // This is the preferred method
    }
}
