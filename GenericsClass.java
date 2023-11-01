package Interface;

public class GenericsClass<T> {
    private T data; // class variable of T type
    public GenericsClass(T data) {  // constructor
        this.data = data;
    }
     // Method that returns T type variable
    public T getData() {
        return this.data;

    }

}
// Here, T used inside the angle bracket <> indicates the type parameter.
// The getData () method returns exactly the type being held.