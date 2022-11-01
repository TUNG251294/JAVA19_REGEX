package Lesson19_REGEX.validateEmail;

import java.util.regex.Pattern;

//Class nay de chay thu regex, khong lien quan toi project
public class ValidateEmail {
    public static void main(String[] args) {
        boolean email = Pattern.matches("^[A-Za-z0-9]+[A-Za-z0-9]*@[a-z]+\\.[a-z]{3}(.vn)*$","Huynhthanhtunga1@gmail.com");
        System.out.println(email);
    }
}
