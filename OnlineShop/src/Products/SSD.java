package Products;

public class SSD extends Memory
{
    private final String type;

    public SSD(String name, double price, String manufacture, int capacity, int speed, String type) {
        super(name, price, manufacture, capacity, speed);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return "SSD{" +
                "capacity=" + capacity +
                ", speed=" + speed +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", manufacture='" + manufacture + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
