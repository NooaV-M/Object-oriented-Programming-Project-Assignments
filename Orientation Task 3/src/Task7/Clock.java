package Task7;

public class Clock {
    private static Clock instance;

    private int currentTime;

    private Clock() {
        long currentTime = 0;
    }

    public static Clock getInstance() {
        if (instance == null) {
            instance = new Clock();
        }
        return instance;
    }

    public int getTime() {
        return currentTime;
    }

    public void changeTime(int time) {
        this.currentTime += time;
    }

}
