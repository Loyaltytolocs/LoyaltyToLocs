
package MyInheritance;

//derived class
    class MountainBike extends Bicycle
{
    // the MountainBike subclass adds one more field
    public static int seatHeight;

    public MountainBike(int gear, int speed) {
        super( gear, speed);
    }

    public MountainBike(int gear, int speed, int startHeight) {
        super(gear, speed);
    }

    // the MountainBike subclass has one constructor
    public void MountainBike(int gear, int speed, int startHeight)
    {
        // invoking base-class(Bicycle) constructor
        seatHeight = startHeight;
    }
    // the MountainBike subclass adds one more method
    public void setHeight(int newValue)
    {
        seatHeight = newValue;
}
// overriding toString() method
// of Bicycle to print more info
@Override public String toString()
{
 return (super.toString() + "\nseat height is " + seatHeight);
}
}
