package Interface;

public class MyRunner {
    public static void main(String[] args) {
        // initialize generic class
        // with Integer data
        GenericsClass<Integer> intObj = new GenericsClass<>(5);
        System.out.println("Generic CLass Returns : " + intObj.getData());

        // initialize generic class again
        // with string data
        GenericsClass<String> stringObj = new GenericsClass<>("Java");
        System.out.println("Generic CLass returns:" + stringObj.getData());


    }
}
