package regex.basic_regex_problems.validate_license_plate_number;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ValidateLicensePlateNumberTest {

    @Test
    void testCase1(){
        String plateNumber="AB1234";
        boolean isValid=ValidateLicensePlateNumber.validatingLicencePlateNumber(plateNumber);
        assertTrue(isValid);
    }

    @Test
    void testCase2(){
        String plateNumber="A12345";
        boolean isValid=ValidateLicensePlateNumber.validatingLicencePlateNumber(plateNumber);
        assertFalse(isValid);
    }
}
