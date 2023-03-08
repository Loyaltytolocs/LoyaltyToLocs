public class Reverse {
    public static void main(String[] args) {
        String s = "Hello my name is bob";
        String reverse = new StringBuffer(s).reverse().toString();
        System.out.println(reverse);
    }
}
