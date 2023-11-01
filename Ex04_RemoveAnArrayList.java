package MyArrayList;

import java.util.ArrayList;

public class Ex04_RemoveAnArrayList
{
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<String>();
        cars.add(1,"VOLVO");
        cars.add("MAZDA");
        cars.add("FORD");
        cars.add("BENZ");
        cars.add("BMW");
        cars.remove("BENZ");
        cars.add("Toyota");
        System.out.println(cars);
    }


}
