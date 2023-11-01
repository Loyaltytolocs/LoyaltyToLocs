package CH_objects;

public class PuppyImpl
{
    public static void main(String []args){
        /* Object creation*/
        Puppy myPuppy = new Puppy("Sheba");
        /*Call class method to set Puppy's age */
        myPuppy.setAge(1);

        /* Call another class method to get Puppy's age */
        myPuppy.getAge();

        /* you can access instance variable as follows as well */

        System.out.println("Variable value :" + myPuppy.PuppyAge);

    }
}
