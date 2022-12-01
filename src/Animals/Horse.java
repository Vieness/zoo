package Animals;

import java.util.Objects;

public class Horse extends Animal implements VoiceAnimal{
    private String type;

    public Horse() {
    }

    public Horse(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public Horse setType(String type) {
        this.type = type;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Horse horse = (Horse) o;
        return Objects.equals(type, horse.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), type);
    }


    @Override
    public void voice() {
        System.out.println("Horse: horse sound");
    }
}
