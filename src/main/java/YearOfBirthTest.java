import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class YearOfBirthTest {
    @Test
    public void testGreetings() {
        YearOfBirth yearCalculator = new YearOfBirth();
        int result = yearCalculator.greeting("John", 1992);
        assertEquals("Hello John! Your year of birth is: 1992", result);
    }

    @Test
    public void testGetAgeValid() {
        YearOfBirth yearCalculator = new YearOfBirth();
        int result = yearCalculator.calculateBirthYear("dfgshd", "32");
        assertEquals(1991, result);
    }

    @Test
    public void testGetAgeInvalid() {
        YearOfBirth yearCalculator = new YearOfBirth();
        int result = yearCalculator.calculateBirthYear("dfsd", "-5");
        assertEquals(0, result);
    }

    @Test
    public void testGetAgeZero() {
        YearOfBirth yearCalculator = new YearOfBirth();
        int result = yearCalculator.calculateBirthYear("dsfsd", "0");
        assertEquals(0, result);
    }

    @Test
    public void testGetAgeAlphabet() {
        YearOfBirth yearCalculator = new YearOfBirth();
        int result = yearCalculator.calculateBirthYear("dsfsd", "hgffg");
        assertEquals(0, result);
    }
}
