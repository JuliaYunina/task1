package Present;

public class Twix extends Sweets{
    private int count;

    public Twix(String name, double weight, double price, int count) {
        super(name, weight, price);
        this.count = count;
    }
    public Twix() {}

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public String toString()
    {return "Twix [" + super.toString() + ", count = " + count + "]";}
}