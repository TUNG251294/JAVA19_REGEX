package Lesson19_REGEX.validateNumberPhone;


import org.junit.Test;

public class NumberPhoneTest extends NumberPhone {
    private final String[] validNumber= {"84-1234567890","84-0505050505"};
    private final String[] invalidNumber = {"84.2222255555","8400606808080"};
    @Test
    public void validate() {
        NumberPhone numberPhone = new NumberPhone();
        for(String number: validNumber){
        boolean isValidate = numberPhone.validate(number);
            System.out.println("Number phone is " + number + " is valid " + isValidate);
        }

        for (String number: invalidNumber){
            boolean isValidate = numberPhone.validate(number);
            System.out.println("Number phone is " + number + " is invalid " + isValidate);
        }
    }
}