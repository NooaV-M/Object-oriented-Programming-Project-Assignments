package Task5;

public class Task5 {
    public static void main(String[] args) {
        ServicePoint servicePoint = new ServicePoint();
        CustomerGenerator customerGenerator = new CustomerGenerator();

        customerGenerator.generateCustomers(7, servicePoint);

        servicePoint.serve();
    }
}