package Task5;

import java.util.LinkedList;

public class ServicePoint {
    int customerId = 1;
    LinkedList<Customer> customers = new LinkedList<Customer>();

    void addToQueue(Customer c) {
        System.out.println("Added customer " + customerId + " to the queue");
        customers.addFirst(c);
        customerId++;
    }

    Customer removeFromQueue() {
        Customer c = customers.removeLast();
        c.setEndTime(System.currentTimeMillis());
        return c;
    }

    void serve() {
        while (!customers.isEmpty()) {
            long serviceStart =  System.currentTimeMillis();

            try {
            Thread.sleep((long) (Math.random() * 500));
            }
            catch (InterruptedException e) {
                e.printStackTrace();
            }

            Customer c = removeFromQueue();
            System.out.println("Customer " + c.getId() + " served for " + (System.currentTimeMillis() - serviceStart) + " milliseconds, then removed from queue after waiting a total of " + c.getDuration() + " milliseconds");
        }
    }
}
