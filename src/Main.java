import Animals.Horse;
import Animals.Shimpanze;

public class Main {
    public static void main(String[] args) {
        ZooVisitor zooVisitor = new ZooVisitor(50);

        Zoo zoo = new Zoo(10 ,
                    new Horse("Bay"),
                new Shimpanze("black"),
                new Kangaroo(150)

        );
        Payment.payTicket(zooVisitor,zoo);

    }
}