package Task7;

import java.util.LinkedList;

public class ServicePoint {
    int customerId = 1;
    LinkedList<Customer> customers = new LinkedList<Customer>();

    void addToQueue(Customer c) {
        //System.out.println("Added customer " + customerId + " to the queue");
        customers.addFirst(c);
        customerId++;
    }

    Customer removeFromQueue() {
        Customer c = customers.removeLast();
        c.setEndTime(Clock.getInstance().getTime());
        return c;
    }

    void serve() {
        while (!customers.isEmpty()) {
            Customer c = removeFromQueue();

            System.out.println("Serving customer " + c.getId() + " who waited " + (c.endTime - c.startTime) + " years.");
        }
    }
}
