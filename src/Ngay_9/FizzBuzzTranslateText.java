package Ngay_9;

import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class FizzBuzzTranslateText {
    @Test
    public void traslate(){
        String str = FizzBuzzTranslate.traslate(7);
        assertEquals("7", str);
    }
}
