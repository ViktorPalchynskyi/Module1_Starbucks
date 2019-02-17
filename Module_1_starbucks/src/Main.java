import base.Customer;
import base.StarBucksCoffee;
import factory.customer_factory.CustomerCreator;
import factory.customer_factory.CustomerFactory;

public class Main {
    public static void main(String[] args) {
        StarBucksCoffee starBucksCoffee = new StarBucksCoffee();
        CustomerCreator customerCreator = new CustomerCreator();

        starBucksCoffee.serveCustomer();


//        try {
//            for (Customer c : customers) {
//                starBucksCoffee.serveCustomer(c);
//
//            }
//        } catch (IndexOutOfBoundsException e) {
//
//            System.out.println("Error:" + e + "You need check your array");
//        }

    }
}
