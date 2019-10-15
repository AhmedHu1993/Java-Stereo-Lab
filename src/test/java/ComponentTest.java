import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ComponentTest {

    Component component;

    @Test
    public void testComponentAsARadio(){
        component = new Radio();
        assertEquals("Sony", component.getManufacturer());
    }
}
