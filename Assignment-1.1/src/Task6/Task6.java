package Task6;

public class Task6 {
    public static void main(String[] args) {
        ServicePoint servicePoint = new ServicePoint();
        CustomerGenerator customerGenerator = new CustomerGenerator();


        for (int i = 1; i <= 5; i++) {
            System.out.println("Testing");
            customerGenerator.generateCustomers((int) (Math.random() * 8 + 1), servicePoint);
            System.out.printf("Average service time: %.2f ms %n", (double) servicePoint.serve());
        }
    }
}