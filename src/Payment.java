public class Payment {
    public static void payTicket(ZooVisitor zooVisitor, Zoo zoo) {
        if (zooVisitor.getMoney() < zoo.getTicket()) {
            System.out.println("you don't have enough money");
        } else {
            var balance = zooVisitor.getMoney() - zoo.getTicket();
            System.out.println("you bay a ticket");
            System.out.println("your balance: " + balance);
            zoo.getHorse().voice();
            zoo.getKangaroo().voice();
            zoo.getShimpanze().voice();
            System.out.println("you feed all the animals");
        }
    }
}
