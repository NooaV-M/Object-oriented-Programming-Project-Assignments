package Task3;

import java.time.Instant;

public class Clock {
    private static Clock instance;

    private Clock() {
        long currentTime = 0;
    }

    public static Clock getInstance() {
        if (instance == null) {
            instance = new Clock();
        }
        return instance;
    }




}
