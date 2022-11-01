package Lesson19_REGEX.validateClassName;

import Lesson19_REGEX.validateEmail.EmailExample;
import org.junit.Test;

public class ClassNameTest extends EmailExample {
    public static final String[] validName = new String[]{"C0319G","A0325H","P0402K"};
    public static final String[] invalidName = {"B0808I", "D1228G", "A1235J"};  /*khong can goi new String[] cung OK*/
    @Test
    public void testValidate() {
        ClassName className = new ClassName();
        for (String name: validName){
            boolean isValid = className.validate(name);
            System.out.println("Class name is " + name + " is valid " + isValid);
        }
        for (String name: invalidName){
            boolean isValid = className.validate(name);
            System.out.println("Class name is " + name + " is invalid " + isValid);
        }
    }
}