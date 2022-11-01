package Lesson19_REGEX.validateNumberPhone;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NumberPhone {
    private static Pattern p;
    private Matcher m;
    private static final String NUMBER_PHONE_REGEX = "^[0-9]{2}\\-[0-9]{10}$";
    public NumberPhone(){
    }
    public boolean validate(String regex){
//        p = Pattern.compile(NUMBER_PHONE_REGEX);
//        m = p.matcher(regex);
//        return m.matches();
        return Pattern.matches(NUMBER_PHONE_REGEX,regex);
    }
//    public static void main(String[] args) {
//        boolean b= Pattern.matches("^[0-9]{2}\\-[0-9]{10}$","84-0347516457");
//        System.out.println(b);
//
//        Pattern p = Pattern.compile("^[0-9]{2}\\-[0-9]{10}$");
//        Matcher m = p.matcher("84-0389952002");
//        boolean boo = m.matches();
//        System.out.println(boo);
//    }
}
