package Ngay_9;

import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class TriangleClassifierTest {
    @Test
    public void Triangle(){
        String tamGiac = TriangleClassifier.Triangle(-1,5,3);
        assertEquals("Sai", tamGiac);
    }
}
