package Animals;

import java.util.Objects;

public class Kangaroo extends Animal implements VoiceAnimal {
    private int height;

    public Kangaroo() {
    }

    public Kangaroo( int height) {
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    public Kangaroo setHeight(int height) {
        this.height = height;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Kangaroo kangaroo = (Kangaroo) o;
        return height == kangaroo.height;
    }

    @Override
    public int hashCode() {
        return Objects.hash(height);
    }

    @Override
    public String toString() {
        return "Animals.Kangaroo{" +
                "height=" + height +
                "} " + super.toString();
    }

    @Override
    public void voice() {
        System.out.println("Animals.Kangaroo: kangaroo sound");
    }
}
