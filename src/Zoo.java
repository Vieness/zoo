import Animals.Horse;
import Animals.Kangaroo;
import Animals.Shimpanze;

import java.util.Objects;

public class Zoo {
    private int ticket;
    private Horse horse;
    private Shimpanze shimpanze;
    private Kangaroo kangaroo;


    public Kangaroo getKangaroo() {
        return kangaroo;
    }

    public Zoo setKangaroo(Kangaroo kangaroo) {
        this.kangaroo = kangaroo;
        return this;
    }

    public Zoo(int ticket, Horse horse, Shimpanze shimpanze, Kangaroo kangaroo) {
        this.ticket = ticket;
        this.horse = horse;
        this.shimpanze = shimpanze;
        this.kangaroo = kangaroo;
    }

    public Zoo(int ticket, Horse horse, Shimpanze shimpanze) {
        this.ticket = ticket;
        this.horse = horse;
        this.shimpanze = shimpanze;
    }

    public Zoo() {
    }

    public Shimpanze getShimpanze() {
        return shimpanze;
    }

    public Zoo setShimpanze(Shimpanze shimpanze) {
        this.shimpanze = shimpanze;
        return this;
    }

    public int getTicket() {
        return ticket;
    }

    public Zoo setTicket(int ticket) {
        this.ticket = ticket;
        return this;
    }

    public Horse getHorse() {
        return horse;
    }

    public Zoo setHorse(Horse horse) {
        this.horse = horse;
        return this;
    }

    @Override
    public boolean equals(Object o) {

        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Zoo zoo = (Zoo) o;
        return ticket == zoo.ticket && Objects.equals(horse, zoo.horse) && Objects.equals(shimpanze, zoo.shimpanze) && Objects.equals(kangaroo, zoo.kangaroo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ticket, horse, shimpanze, kangaroo);
    }

    @Override
    public String toString() {
        return "Zoo{" +
                "ticket=" + ticket +
                ", horse=" + horse +
                ", shimpanze=" + shimpanze +
                ", kangaroo=" + kangaroo +
                '}';
    }
}

