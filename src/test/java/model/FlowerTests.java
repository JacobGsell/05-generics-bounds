package model;

import ohm.softa.a05.model.Flower;
import ohm.softa.a05.model.PlantColor;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class FlowerTests {

    private final Logger logger = LogManager.getLogger();
    private Flower testFlower;

    @BeforeEach
    void setup()
    {
        testFlower = new Flower(0.5, "Hortensiengewächs", "Hortensie", PlantColor.BLUE);
    }
}
