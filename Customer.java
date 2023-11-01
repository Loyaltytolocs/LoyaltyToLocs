package ShoppingCartInvoice;

public class Customer {
    String name;
    int customerId;

    public Customer(String name,int id) {
        this.customerId = id;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
@Override
    public String toString(){
        return ("This is Your Name" + this.name
        + this.customerId
        ) ;
    }

}
