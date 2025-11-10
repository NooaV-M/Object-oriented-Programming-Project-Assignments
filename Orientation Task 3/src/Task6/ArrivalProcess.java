package Task6;

import Task6.eduni.distributions.Normal;

import java.util.ArrayList;

public class ArrivalProcess {
    String eventType = "Arrival";
    Normal normalDist = new Normal(5.0, 3.0); // Mean = 5.0, StdDev = 1.0

    Long newArrival(ArrayList<Long> eventList) {
        double interArrivalTime = normalDist.sample();
        long duration = (long) normalDist.sample();
        eventList.add(duration);
        return eventList.get(eventList.size()-1);
    }
}