import static org.junit.jupiter.api.Assertions.assertEquals;

import java.security.cert.PKIXCertPathChecker;
import java.time.Year;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;


public class testLeapYear {

    @ParameterizedTest
    @CsvSource({
            "1999, false",
            "1996, true",
            "1600, true",
    })
    void returnDivisibleBy4(int input, boolean output) {
        assertEquals(output, newYear(input).isLeapYear());
    }

    private LeapYear newYear(int input) {
        return new LeapYear(input);
    }

    @ParameterizedTest
    @CsvSource({
            "1999, false",
            "1996, true",
            "1600, true",
    })
    void returnDivisibleBy4Not100(int input, boolean output) {
        assertEquals(output, newYear(input).isLeapYear());
    }

    @ParameterizedTest
    @CsvSource({
            "1999, false",
            "1996, true",
            "1600, true",
    })
    void returnDivisibleBy4And400Not100(int input, boolean output) {
        assertEquals(output, newYear(input).isLeapYear());
    }

}
