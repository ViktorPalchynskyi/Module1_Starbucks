import base.Customer;
import base.StarBucksCoffee;
import factory.customer_factory.CustomerCreator;
import factory.customer_factory.CustomerFactory;

public class Main {
    public static void main(String[] args) {
        StarBucksCoffee starBucksCoffee = new StarBucksCoffee();
        CustomerCreator customerCreator = new CustomerCreator();
        Customer [] customers = customerCreator.createCustomer(10);

        try {
            for (Customer c : customers) {
                starBucksCoffee.serveCustomer(c);

            }
        } catch (IndexOutOfBoundsException e) {

            System.out.println("Error:" + e + "You need check your array");
        }
        catch (NullPointerException e){
            System.out.println("Customer has not existed yet");
        }
    }
}
