package tenlophoc;

public class ClassStudyTest {
    private static ClassStudy study;
    public static final String[] validStudyName = new String[] {"C0318G" , "C1318M"};
    public static final String[] invalidStudyName = new String[] {"M0318G" , "P0323A"};

    public static void main(String[] args) {
        study = new ClassStudy();
        for (String className: validStudyName) {
            boolean isvalid = study.validate(className);
            System.out.println("Class name is " + className +" is valid: "+ isvalid);
        }
        for (String className: invalidStudyName) {
            boolean isvalid = study.validate(className);
            System.out.println("Class name is " + className +" is valid: "+ isvalid);
        }
    }
}
