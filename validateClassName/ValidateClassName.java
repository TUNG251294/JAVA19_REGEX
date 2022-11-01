package Lesson19_REGEX.validateClassName;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//Class nay de chay thu regex, khong lien quan toi project
public class ValidateClassName {
    public static void main(String[] args) {
        boolean isValidate = Pattern.matches("^[CAP][0-9]{4}[GHIKLM]$","C0318G");
        System.out.println(isValidate);

        Pattern pattern = Pattern.compile("^[CAP][0-9]{4}[GHIKLM]$");
        Matcher matcher = pattern.matcher("P0323A");
        boolean isMatches = matcher.matches();
        System.out.println(isMatches);
    }
}
