package Lesson19_REGEX.validateClassName;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*Bắt đầu bằng một ký tự chữ hoa C hoặc A hoặc P
Không chứa các ký tự đặc biệt
Theo sau ký tự bắt đầu là 4 ký tự số
Kết thúc là 1 trong những ký tự chữ hoa: G, H, I, K, L, M*/
public class ClassName {
    private static Pattern pattern;
    private Matcher matcher;
    private static final String CLASS_REGEX = "^[CAP][0-9]{4}[GHIKLM]$";

    public ClassName(){
    }

//    public boolean validate(String regex){
//        pattern = Pattern.compile(CLASS_REGEX);
//        matcher = pattern.matcher(regex);
//        return matcher.matches();
//    }

    public boolean validate(String regex){
        return Pattern.matches(CLASS_REGEX,regex);
    }
}
