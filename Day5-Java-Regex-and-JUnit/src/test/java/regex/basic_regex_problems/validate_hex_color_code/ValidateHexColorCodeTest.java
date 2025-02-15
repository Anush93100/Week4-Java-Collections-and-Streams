package regex.basic_regex_problems.validate_hex_color_code;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import regex.basic_regex_problems.validate_hex_color_code.ValidateHexColorCode;

public class ValidateHexColorCodeTest {

    @Test
    void testCase1(){
        String colorCode="#FFA500";
        boolean isValid= ValidateHexColorCode.validatingHexColorCode(colorCode);
        assertTrue(isValid);
    }

    @Test
    void testCase2(){
        String colorCode="#123";
        boolean isValid= ValidateHexColorCode.validatingHexColorCode(colorCode);
        assertFalse(isValid);
    }
}
