import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestTest {

    @Test
    public void testBscDuration() {
        assertEquals(4, Degree.getSchoolLenght("bsc"));
    }

    @Test
    public void testMscDuration() {
        assertEquals(6, Degree.getSchoolLenght("msc"));
    }

    @Test
    public void testPhdDuration() {
        assertEquals(3, Degree.getSchoolLenght("phd"));
    }
}
