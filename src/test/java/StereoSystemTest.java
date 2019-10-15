import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StereoSystemTest {

    StereoSystem hiFi;
    Radio radio;
    ExternalPlayer mp3Player;

    @Before
    public void before(){
        hiFi = new StereoSystem();
        radio = new Radio();
        mp3Player = new ExternalPlayer("Walkman", ExternalPlayerTypes.MP3PLAYER);
    }

    @Test
    public void testComponentsIsZero(){
        assertEquals(0, hiFi.getComponents().size());
    }

    @Test
    public void testAddComponentToStereoSystem(){
        hiFi.addComponent(radio);
        hiFi.addComponent(mp3Player);
        assertEquals(2, hiFi.getComponents().size());
    }
}
