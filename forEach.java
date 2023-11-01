package Loops;

public class forEach {
    public static void main(String[] args) {
        String[] myArray = {"Ranae","Sadiki","Uyai"};
        myArray[2] = "Nagwa";
        for (String person: myArray){
            System.out.println(person);
        }
    }
}
