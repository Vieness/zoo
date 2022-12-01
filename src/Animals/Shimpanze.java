package Animals;

import java.util.Objects;

public class Shimpanze extends Animal implements VoiceAnimal {
    private String color;

    public Shimpanze() {
    }

    public Shimpanze(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public Shimpanze setColor(String color) {
        this.color = color;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Shimpanze shimpanze = (Shimpanze) o;
        return Objects.equals(color, shimpanze.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(color);
    }

    @Override
    public String toString() {
        return "Shimpanze{" +
                "color='" + color + '\'' +
                '}';
    }

    @Override
    public void voice() {
        System.out.println("Shimpanze: shimpanze sound");
    }
}

