package Ngay_9;

import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class NextDayCalculatorTest {
    @Test
    void nextDay(){
        String day = NextDayCalculator.nextDay(31,12,2018);
        assertEquals("1-1-2019", day);

    }
}
