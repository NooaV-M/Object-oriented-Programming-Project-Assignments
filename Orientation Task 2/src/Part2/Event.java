package Part2;

public class Event implements Comparable<Event> {
    long eventTime;
    int eventID;
    static int eventIndex = 1;
    public Event(long eventTime) {
        this.eventTime = eventTime;
        this.eventID = eventIndex;
        System.out.println("New Event " + eventID + " with timestamp " + eventTime);
        eventIndex += 1;
    }

    public int compareTo(Event o) {
        return Long.compare(eventTime, o.eventTime);
    }
}
