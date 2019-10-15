import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StereoSystemTest {

    StereoSystem hiFi;

    @Before
    public void before(){
        hiFi = new StereoSystem();
    }

    @Test
    public void testComponentsIsZero(){
        assertEquals(0, hiFi.getComponents().size());
    }
}
