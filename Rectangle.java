public class Rectangle extends Shape {
    public static void main(String[] args) {
        Rectangle obj = new Rectangle();
        obj.D = 300;
        obj.calculateArea();

    }
public void calculateArea(){
    System.out.println(D*D);

}


}
