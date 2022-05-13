package tenlophoc;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ClassStudy {
    private static Pattern pattern;
    private Matcher matcher;
    private static final String CLASS_NAME_REGEX = "[CAP]\\d{4}([G-M])$";

    public ClassStudy() {
        pattern = Pattern.compile(CLASS_NAME_REGEX);
    }
    public boolean validate(String regex){
        matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
