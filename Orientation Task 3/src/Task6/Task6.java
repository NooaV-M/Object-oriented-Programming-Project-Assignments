package Task6;


import java.util.ArrayList;

public class Task6 {
    public static void main(String[] args) {
        ArrivalProcess arrivalProcess = new ArrivalProcess();
        ArrayList<Long> eventList = new ArrayList<>();
        for (int i = 0; i < 11; i++) {
            Clock.getInstance().changeTime(arrivalProcess.newArrival(eventList));
        }

        for (Long duration : eventList) {
            System.out.println("Event with duration: " + duration);
        }
    }
}
