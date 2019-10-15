import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ExternalPlayerTest {

    ExternalPlayer mobilePhone;

    @Before
    public void before(){
        mobilePhone = new ExternalPlayer("Nokia", ExternalPlayerTypes.PHONE);
    }

    @Test
    public void externalPlayerHasManufacturerAndType(){
        assertEquals("Nokia", mobilePhone.getManufacturer());
        assertEquals(ExternalPlayerTypes.PHONE , mobilePhone.getType());
    }

    @Test
    public void externalPlayerControl(){
        assertEquals("Input Source", mobilePhone.control());
    }

    @Test
    public void externalPlayerInstruction(){
        assertEquals("Adjust the output volume", mobilePhone.instructions());
    }
}
