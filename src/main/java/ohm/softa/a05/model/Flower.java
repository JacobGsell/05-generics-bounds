package ohm.softa.a05.model;

public class Flower extends Plant{

    PlantColor color;

    public Flower(double height, String family, String name, PlantColor color)
    {
        super(height, family, name);

        if(color == PlantColor.GREEN)
        {
            throw new IllegalArgumentException("Blumen sind nicht grün!");
        }

        this.color = color;
    }

    @Override
    public PlantColor getColor() {
        return this.color;
    }
}
