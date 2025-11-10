package Task7;

public class Event implements Comparable<Event> {
    int eventTime;
    EventType eventType;
    int eventID;
    static int eventIndex = 1;
    public Event(int eventDuration, EventType eventType) {
        this.eventType = eventType;
        this.eventTime = Clock.getInstance().getTime() + eventDuration;
        this.eventID = eventIndex;
        Clock.getInstance().changeTime(eventDuration);
        System.out.println("New Event " + eventID + " with ending time " + this.eventTime);
        eventIndex += 1;
    }

    public int compareTo(Event o) {
        return Long.compare(eventTime, o.eventTime);
    }
}
