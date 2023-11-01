package ShoppingCartInvoice;
// we created a  class
public class Product {
//declaring Variables of class  product name of type String and primitive type unit price int total double.
    String productName;
    int productQty;
    double unitPrice;
    double total;
    // created an instance of the class                                     Product = constructors
    //setting variables into parameters
    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getProductQty() {
        return productQty;
    }

    public void setProductQty(int productQty) {
        this.productQty = productQty;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productName='" + productName + '\'' +
                ", productQty=" + productQty +
                ", unitPrice=" + unitPrice +
                ", total=" + total +
                '}';
    }

    public Product(String productName, int productQty, double unitPrice, double total) {
        this.productName = productName;
        this.productQty = productQty;
        this.unitPrice = unitPrice;
        this.total = total;


    }
}

