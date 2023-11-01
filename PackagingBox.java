package CH_objects;

/**
 * The PackagingBox class
 */
public class PackagingBox {


    //member variables
    private double length;
    private double breadth;
    private double height;
    public double volume;
    double weight;
    double price;

    // methods

//---- get and set length

    public void setLength(double length) {
        this.length = length;
    }

    public double getLength() {
        return length;
    }

    public double getBreadth() {
        return breadth;
    }

    public void setBreadth(double breadth) {
        this.breadth = breadth;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    private final double Volume;

    //compute Volume
    {
        Object Height = 30;
        Object Breath = 15;
        double Length = 20;
        double Volume = Double.parseDouble("Length*Breath*Height");
        this.Volume = Volume;
    }

    {
    }
}