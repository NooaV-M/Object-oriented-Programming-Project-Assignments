package Task7;

import Task7.distributions.Normal;

public class ArrivalProcess {
    EventType eventType = EventType.ARRIVAL;
    Normal normalDist = new Normal(5.0, 3.0); // Mean = 5.0, StdDev = 1.0

    void newArrival(EventList eventList) {
        int duration = (int) normalDist.sample();
        eventList.addEvent(eventType, duration);
    }
}
