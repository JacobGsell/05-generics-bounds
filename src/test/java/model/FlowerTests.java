package model;

import ohm.softa.a05.model.Flower;
import ohm.softa.a05.model.PlantColor;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class FlowerTests {

    private final Logger logger = LogManager.getLogger();

    @Test
    void createGreenFlower()
    {
        assertThrows(IllegalArgumentException.class, () -> new Flower(0.5, "Abracadabra", "test", PlantColor.GREEN));
    }

    @Test
    void createEmptyName()
    {
        assertThrows(IllegalArgumentException.class, () -> new Flower(0.5, "Family", "", PlantColor.BLUE));
    }

    @Test
    void createEmptyFamily()
    {
        assertThrows(IllegalArgumentException.class, () -> new Flower(0.5, null, "name", PlantColor.BLUE));
    }

    @Test
    void createTooSmallFlower()
    {
        assertThrows(IllegalArgumentException.class, () -> new Flower(0, "family", "name", PlantColor.BLUE));
    }
}
