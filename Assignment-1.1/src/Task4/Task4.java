package Task4;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        LinkedList<Customer> customers = new LinkedList<Customer>();
        int customerId = 1;

        while (true) {
            System.out.println("To add a customer to the queue, enter 'Add'");
            System.out.println("To get a customer from the queue, enter 'Get'");
            System.out.println("To end program, enter 'End'");
            String currentInput = input.nextLine();
            if (currentInput.equals("Add")) {
                System.out.println("Added customer " +  customerId + " to the queue");
                customers.addFirst(new Customer(customerId, System.currentTimeMillis()));
                customerId++;
            }
            else if (currentInput.equals("Get")) {
                Customer c = customers.removeLast();
                c.setEndTime(System.currentTimeMillis());
                System.out.println("Customer " + c.getId() + " has been removed from the queue");
                System.out.println("Customer " + c.getId() + " waited for " + c.getDuration() + " milliseconds");
            }
            else if (currentInput.equals("End")) {
                break;
            }
            else {
                System.out.println("Invalid input");
            }
        }
        for (Customer customer : customers) {
            System.out.println("Customer " + customer.getId());
        }
    }
}
