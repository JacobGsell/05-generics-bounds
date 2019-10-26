package model;

import ohm.softa.a05.model.Shrub;
import ohm.softa.a05.model.PlantColor;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class ShrubTests {

    private final Logger logger = LogManager.getLogger();

    @Test
    void createShrubThatIsNotGreen()
    {
        assertThrows(IllegalArgumentException.class, () -> new Shrub("family", "Abracadabra", 0.5, PlantColor.BLUE));
    }

    @Test
    void createEmptyName()
    {
        assertThrows(IllegalArgumentException.class, () -> new Shrub("family", null, 0.5, PlantColor.GREEN));
    }

    @Test
    void createEmptyFamily()
    {
        assertThrows(IllegalArgumentException.class, () -> new Shrub(null, "Abracadabra", 0.5, PlantColor.GREEN));
    }

    @Test
    void createTooSmallShrub()
    {
        assertThrows(IllegalArgumentException.class, () -> new Shrub(null, "Abracadabra", 0, PlantColor.GREEN));
    }
}
