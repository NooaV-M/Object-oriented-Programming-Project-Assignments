package Part3;

public class Main {
    public static void main(String[] args) {
        EventList eventList = new EventList();
        for (int i = 0; i < 9; i++) {
            long num = (long)(Math.random()*100);
            if (num > 50) {
                eventList.addEvent(EventType.ARRIVAL);
            }
            else {
                eventList.addEvent(EventType.EXIT);
            }
            System.out.println(Event.eventIndex);
            try {
                Thread.sleep(num);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        eventList.printEventList();
    }
}