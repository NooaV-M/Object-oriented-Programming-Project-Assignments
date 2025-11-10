package Task7;

public class Task7 {
    public static void main(String[] args) {
        EventList eventList = new EventList();
        ArrivalProcess arrivalProcess = new ArrivalProcess();

        for (int i = 0; i < 10; i++) {
            arrivalProcess.newArrival(eventList);
        }

        System.out.println();

        eventList.printEventList();

        ServicePoint servicePoint = new ServicePoint();

        while (!eventList.getEventList().isEmpty()) {
            servicePoint.addToQueue(new Customer(servicePoint.customerId, eventList.getEvent().eventTime));
        }

        System.out.println();
        System.out.println("Timi is now: " + Clock.getInstance().getTime());
        System.out.println();
        int time = (int) (Math.random() * 10) + 1;
        System.out.println("waiting for " + time + " time units");
        Clock.getInstance().changeTime(time);
        servicePoint.serve();
    }
}
