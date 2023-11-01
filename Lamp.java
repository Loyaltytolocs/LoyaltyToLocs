package CH_objects;

public class Lamp {
// stores the value for light
    // true if light is on
    //false if light is off

    boolean isOn;

    // method to turn on the light
    void turnOn(){
         isOn = true;
         System.out.println("Light on?" + true);
    }

// method to turn off the light
    void turnOff()
    {
    isOn = false;
    System.out.println("Light on?" + false);
    }



}


