package Task5;

public class CustomerGenerator {
    void generateCustomers (int numberOfCustomers, ServicePoint servicePoint) {
        for (int i = 0; i < numberOfCustomers; i++) {
            servicePoint.addToQueue(new Customer(servicePoint.customerId, System.currentTimeMillis()));
        }
    }
}
