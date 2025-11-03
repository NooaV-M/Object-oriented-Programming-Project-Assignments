package Task3;

import java.util.ArrayList;

public class Task3 {
    public static void main(String[] args) {
        ArrayList<Customer> customers = new ArrayList<Customer>();
        for (int i = 1 ; i < 6 ; i++) {
            customers.add(new Customer(i, System.currentTimeMillis()));
        }

        for (Customer customer : customers) {
            System.out.println("Customer " + customer.getId());
            long delay = (int) (Math.random()*100);

            customer.setEndTime(System.currentTimeMillis());

            System.out.println("Service duration: " + customer.getDuration() + " ms");
            try {
            Thread.sleep(delay);
            }
            catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
