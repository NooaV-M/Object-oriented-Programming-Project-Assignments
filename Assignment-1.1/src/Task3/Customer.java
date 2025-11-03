package Task3;

public class Customer {
    int id;
    long startTime;
    long endTime = 0;

    Customer (int id, long startTime) {
        this.id = id;
        this.startTime = startTime;
    }

    int getId() {
        return id;
    }

    void setStartTime(long startTime) {
        this.startTime = startTime;
    }

    long getStartTime() {
        return startTime;
    }

    void setEndTime(long endTime) {
        this.endTime = endTime;
    }

    long getEndTime() {
        return endTime;
    }

    long getDuration() {
        if (endTime != 0) {
        return endTime - startTime;
        }
        else return 0;
    }
}