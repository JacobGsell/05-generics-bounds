package ohm.softa.a05.utils;

import ohm.softa.a05.collections.SimpleList;
import ohm.softa.a05.collections.SimpleListImpl;
import ohm.softa.a05.model.Plant;
import ohm.softa.a05.model.PlantBed;
import ohm.softa.a05.model.PlantColor;

import java.util.HashMap;
import java.util.Map;

public abstract class PlantBedUtility {

    public static  <T extends Plant> Map<PlantColor, SimpleList<T>> splitBedByColor(PlantBed<T> bed) {

        Map<PlantColor, SimpleList<T>> result = new HashMap<>();

        // Durchlaufe alle Einträge
        for (T item: bed.getPlants()){
            // Kein Eintrag an key gefunden? => neue liste

            if(!result.containsKey(item.getColor()))
            {
                result.put(item.getColor(), new SimpleListImpl<>());
            }

            result.get(item.getColor()).add(item);
        }

        return result;
    }
}
