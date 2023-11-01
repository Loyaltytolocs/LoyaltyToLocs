package MyArrayList;

import java.util.ArrayList;

public class Ex07_LoopThroughArrayListForEach
{
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("VOLVO");
        cars.add("MAZDA");
        cars.add("FORD");
        cars.add("BENZ");
        cars.add("BMW");
        for (String i : cars) {
                System.out.println(i);
            }
        }
    }



