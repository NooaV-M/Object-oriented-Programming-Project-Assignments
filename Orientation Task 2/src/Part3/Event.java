package Part3;


public class Event implements Comparable<Event> {
    long eventTime;
    EventType eventType;
    int eventID;
    static int eventIndex = 1;
    public Event(long eventTime,  EventType eventType) {
        this.eventType = eventType;
        this.eventTime = eventTime;
        this.eventID = eventIndex;
        System.out.println("New Event " + eventID + " with timestamp " + eventTime);
        eventIndex += 1;
    }

    public int compareTo(Event o) {
        return Long.compare(eventTime, o.eventTime);
    }
}
