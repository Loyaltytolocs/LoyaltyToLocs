package CH_objects;

public class Puppy
{
int PuppyAge;

public Puppy(String name)
{
            //This constructor has one parameter, name.
System.out.println("name chosen is :" + name );
}
public void setAge( int age){
    PuppyAge = age;
}

public int getAge(){

    System.out.println("Puppy's age is :" + PuppyAge);
    return PuppyAge;
}
}
