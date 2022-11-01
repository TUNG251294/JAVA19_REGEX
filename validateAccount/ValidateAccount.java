package Lesson19_REGEX.validateAccount;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//Class nay de chay thu regex, khong lien quan toi project
public class ValidateAccount {
    public static void main(String[] args) {
        boolean account = Pattern.matches("^[_0-9a-z]{6,}$","tung_94");
        System.out.println(account);

        Pattern pattern = Pattern.compile("^[_0-9a-z]{6,}$");
        Matcher matcher = pattern.matcher("trang_96");
        boolean isTrue = matcher.matches();
        System.out.println(isTrue);
    }
}
