package Part2;

import java.util.PriorityQueue;

public class EventList {
    private PriorityQueue<Event> priorityQueue = new PriorityQueue<Event>();

    public EventList () {
    }

    public void addEvent(){
        Event e = new Event(System.currentTimeMillis());
        priorityQueue.add(e);
    }

    public Event getEvent(){
        return priorityQueue.poll();
    }

    public void printEventList(){
        PriorityQueue<Event> tempQueue = new PriorityQueue<>(priorityQueue);
        System.out.println("Printing event list");
        for (Event e : tempQueue) {
            System.out.println(e.eventID);
        }

        System.out.println("Printing EventList in order...");
        while (!tempQueue.isEmpty()){
            Event e = tempQueue.poll();
            System.out.println("Event " + e.eventID + " with timestamp " + e.eventTime);

        }
    }
}
