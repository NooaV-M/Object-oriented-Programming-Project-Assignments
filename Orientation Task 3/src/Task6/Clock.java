package Task6;

public class Clock {
    private static Clock instance;

    private long currentTime;

    private Clock() {
        long currentTime = 0;
    }

    public static Clock getInstance() {
        if (instance == null) {
            instance = new Clock();
        }
        return instance;
    }

    public long getTime() {
        return currentTime;
    }

    public void changeTime(long time) {
        this.currentTime += time;
    }

}
