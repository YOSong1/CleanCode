package test.java.password;

import main.java.password.PasswordStrengthMeter;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PasswordStrengthMeterTest {

    @Test
    void meetsAllCriteria_Then_String(){
        PasswordStrengthMeter meter = new PasswordStrengthMeter();
        assertEquals("STRONG", meter.meter("ab12!@AB"));
    }
}
