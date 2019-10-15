import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RadioTest {

    Radio radio;

    @Before
    public void before(){
        radio = new Radio();
    }

    @Test
    public void testRadioHasManufacturer(){
        assertEquals("Sony", radio.getManufacturer());
    }

    @Test
    public void testRadioCanTuneToStation(){
        assertEquals("tuned to 5Live", radio.tune("5Live"));
    }

    @Test
    public void testRadioInstructions(){
        assertEquals("Wire together radio and amplifier", radio.instructions());
    }

    @Test
    public void testRadioControl(){
        assertEquals("Select Station", radio.control());
    }
}
