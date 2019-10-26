package ohm.softa.a05.model;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

public abstract class Plant implements Comparable<Plant> {
    private double height;
    private String family;
    private String name;

    protected Plant(double height, String family, String name) {
        if(height <= 0) throw new IllegalArgumentException("too small!") ;
        if(family == null || family.length() == 0) throw new IllegalArgumentException("no family!");
        if(name == null || name.length() == 0) throw new IllegalArgumentException("no name!");
        this.height = height;
        this.family = family;
        this.name = name;
    }

    public double getHeight() {
        return this.height;
    }

    public String getFamily() {
        return this.family;
    }

    public String getName() {
        return this.name;
    }

    public abstract PlantColor getColor();

    @Override
    public String toString() {
        return new ToStringBuilder(this).
                append("height", getHeight()).
                append("family", family).
                append("name", name).
                append("color", getColor()).
                toString();
    }


    @Override
    public int compareTo(Plant plant) {
        return Double.compare(this.height, plant.height);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (!(o instanceof Plant)) return false;

        Plant plant = (Plant) o;

        return new EqualsBuilder()
                .append(getHeight(), plant.getHeight())
                .append(getFamily(), plant.getFamily())
                .append(getName(), plant.getName())
                .append(getColor(), plant.getColor())
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).
                append(getHeight()).
                append(getFamily()).
                append(getName()).
                append(getColor()).
                toHashCode();
    }
}
