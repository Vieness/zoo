import java.util.Objects;

public class ZooVisitor {
    private int money;

    public ZooVisitor() {
    }

    public ZooVisitor(int money) {
        this.money = money;
    }

    public int getMoney() {
        return money;
    }

    public ZooVisitor setMoney(int money) {
        this.money = money;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ZooVisitor that = (ZooVisitor) o;
        return money == that.money;
    }

    @Override
    public int hashCode() {
        return Objects.hash(money);
    }

    @Override
    public String toString() {
        return "ZooVisitor{" +
                "money=" + money +
                "} " + super.toString();
    }
}
