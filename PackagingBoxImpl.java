package CH_objects;

public class PackagingBoxImpl {

    private double Volume;

    public void main(String args) {


        //creating an object of the class
        PackagingBox myBox = new PackagingBox();

// setting the dimensions
        myBox.setLength(10);
        myBox.setBreadth(20);
        myBox.setHeight(30);

        //setting the weight
        myBox.getWeight();


        //setting the price
        myBox.getPrice();

        // get the values
        System.out.println("dimension of the box:");
        System.out.println("Length:" + myBox.getLength());
        System.out.println("Breadth:" + myBox.getBreadth());
        System.out.println("Height:" + myBox.getHeight());


        System.out.println("Weight, Volume and Price of the box:");
        System.out.println("Weight:" + myBox.getWeight());
        System.out.println("Volume:" + myBox.getVolume());
        System.out.println("Price" + myBox.getPrice());
        {

        }
    }
}

