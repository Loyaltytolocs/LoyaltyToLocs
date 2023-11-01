package MyArrayList;

import java.util.ArrayList;

public class Ex06_LoopThroughAnArrayList
{
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("VOLVO");
        cars.add("MAZDA");
        cars.add("FORD");
        cars.add("BENZ");
        cars.add("BMW");
        for(int i = 0; i < cars.size(); i++) {
            System.out.println(cars.get(i));
        }




    }


}
