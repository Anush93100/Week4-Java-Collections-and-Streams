package regex.basic_regex_problems.validate_a_username;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import regex.basic_regex_problems.validate_a_username.ValidateAUsername;

public class ValidateAUsernameTest {

    @Test
    void testCase1(){
        //valid userName
        String username="user_123";
        boolean isValid= ValidateAUsername.validatingUsername(username);
        assertTrue(isValid);
    }

    @Test
    void testCase2(){
        //valid userName
        String username="123user";
        boolean isValid= ValidateAUsername.validatingUsername(username);
        assertFalse(isValid);
    }

    @Test
    void testCase3(){
        //valid userName
        String username="us";
        boolean isValid= ValidateAUsername.validatingUsername(username);
        assertFalse(isValid);
    }
}
