public class CheckJavaInstallation {
    public static void main(String[] args) {
        String version = System.getProperty("java.version");
        System.out.println("Java version: " + version);
    }
}
