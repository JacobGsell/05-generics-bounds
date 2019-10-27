package ohm.softa.a05.model;

public class Shrub extends Plant{

    PlantColor color;

    public Shrub(String family, String name, double height, PlantColor color)
    {
        super(height, family, name);

        if(color != PlantColor.GREEN)
        {
            throw new IllegalArgumentException("Sträuche sind immer Grün!");
        }

        this.color = color;
    }

    @Override
    public PlantColor getColor() {
        return this.color;
    }
}
