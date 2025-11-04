package Part2;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        EventList eventList = new EventList();
        for (int i = 0; i < 9; i++) {
            eventList.addEvent();
            System.out.println(Event.eventIndex);
            try {
                Thread.sleep((long)(Math.random()*100));
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        eventList.printEventList();
    }
}