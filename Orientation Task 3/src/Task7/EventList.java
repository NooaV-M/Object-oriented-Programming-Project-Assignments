package Task7;

import java.util.PriorityQueue;

public class EventList {
    private PriorityQueue<Event> priorityQueue = new PriorityQueue<Event>();

    public EventList () {
    }

    public void addEvent(EventType type, int duration){
        Event e = new Event(duration, type);
        priorityQueue.add(e);
    }


    public Event getEvent(){
        return priorityQueue.poll();
    }

    public PriorityQueue<Event> getEventList(){
        return priorityQueue;
    }

    public void printEventList(){
        PriorityQueue<Event> tempQueue = new PriorityQueue<>(priorityQueue);
        System.out.println("Printing EventList in order...");
        while (!tempQueue.isEmpty()){
            Event e = tempQueue.poll();
            System.out.println(e.eventType + " event " + e.eventID + " with timestamp " + e.eventTime);

        }
    }
}
