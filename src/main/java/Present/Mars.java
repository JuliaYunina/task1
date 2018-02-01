package Present;

public class Mars extends Sweets{
    private String type;

    public Mars(String name, double weight, double price, String type) {
        super(name, weight, price);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    @Override
    public String toString()
    {return "Mars [" + super.toString() + ", type = " + type + "]";}
}