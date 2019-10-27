package model;

import ohm.softa.a05.collections.SimpleList;
import ohm.softa.a05.model.Flower;
import ohm.softa.a05.model.PlantBed;
import ohm.softa.a05.model.PlantColor;
import ohm.softa.a05.model.Shrub;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;

public class PlantBedTests {

    private final Logger logger = LogManager.getLogger();

    private PlantBed<Shrub> shrubBed;
    private PlantBed<Flower> flowerBed;

    @BeforeEach
    void setup(){
        shrubBed = new PlantBed<>();
        flowerBed = new PlantBed<>();

        flowerBed.add(new Flower(1, "Golden Celebration", "0.4", PlantColor.YELLOW));
        flowerBed.add(new Flower(1, "Abracadabra", "0.5", PlantColor.RED));
        flowerBed.add(new Flower(1, "Golden Celebration", "0.3", PlantColor.YELLOW));
        flowerBed.add(new Flower(1, "Golden Celebration", "0.35", PlantColor.YELLOW));
        flowerBed.add(new Flower(1, "Abracadabra", "0.35", PlantColor.RED));
        flowerBed.add(new Flower(1, "Rosa chinensis", "0.35", PlantColor.ORANGE));
        flowerBed.add(new Flower(1, "Curly Sue", "0.35", PlantColor.ORANGE));

        shrubBed.add(new Shrub("Buxus", "Buxus sempervirens", 1.5, PlantColor.GREEN));
        shrubBed.add(new Shrub("Buxus", "Buxus sempervirens", 1.1, PlantColor.GREEN));
        shrubBed.add(new Shrub("Buxus", "Buxus sempervirens", 1.2, PlantColor.GREEN));
        shrubBed.add(new Shrub("Buxus", "Buxus sempervirens", 1.4, PlantColor.GREEN));
    }

    @Test
    void getFlowerByColor()
    {
        SimpleList<Flower> result = flowerBed.getPlantsByColor(PlantColor.YELLOW);

        assertEquals(result.size(), 3);
    }

    @Test
    void getShrubSize()
    {
        assertEquals(shrubBed.size(), 4);
    }

    @Test
    void getRedFlowers()
    {
        SimpleList<Flower> result = flowerBed.getPlantsByColor(PlantColor.RED);

        for (Flower flower : result)
        {
            assertEquals(PlantColor.RED, flower.getColor());
        }
    }

    @Test
    void getGreenPlants()
    {
        SimpleList<Flower> greenFlowers = flowerBed.getPlantsByColor(PlantColor.GREEN);
        assertEquals(greenFlowers.size(), 0);

        assertEquals(shrubBed.size(), 4);
    }
}
