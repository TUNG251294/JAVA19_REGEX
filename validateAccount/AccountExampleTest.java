package Lesson19_REGEX.validateAccount;

import Lesson19_REGEX.validateEmail.EmailExample;
import org.junit.Test;

public class AccountExampleTest extends EmailExample {
    public static final String[] validAccount = new String[] { "123abc_", "_abc123", "______", "123456","abcdefgh" };
    public static final String[] invalidAccount = new String[] { ".@", "12345", "1234_", "abcde" };
    @Test
    public void testValidate() {
        AccountExample accountExample = new AccountExample();
        for (String account : validAccount) {
            boolean isvalid = accountExample.validate(account);
            System.out.println("Account is " + account +" is valid: "+ isvalid);
        }
        for (String account : invalidAccount) {
            boolean isvalid = accountExample.validate(account);
            System.out.println("Account is " + account +" is invalid: "+ isvalid);
        }
    }
}