package CH_objects;

public class MobileImpl
{
    public static void main(String args[]){

//Object created
        Mobile abhishek = new Mobile("iPhone","Gold",8);
        Mobile rahul = new Mobile("Samsung","White",13);
        Mobile ravi = new Mobile("Nexus","Black",8);

//Smartphone details displayed for each user
        System.out.println("Abhilasha own " + abhishek.brand +" "+ abhishek.color + " color smartphone having "+ abhishek.camera+ "MP"+ " camera");
        System.out.println("Rahul own " + rahul.brand +" "+ rahul.color + " color smartphone having "+ rahul.camera+ "MP"+ " camera");
        System.out.println("Ravi own " + ravi.brand +" "+ ravi.color + " color smartphone having "+ ravi.camera+ "MP"+ " camera");

    }
}
