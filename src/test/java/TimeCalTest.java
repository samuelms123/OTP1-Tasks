import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TimeCalTest {

    TimeCal timecal = new TimeCal();

    @Test
    public void testCalculateTime() {
        assertEquals(1.0, timecal.calculateTime(100, 100));
    }

}