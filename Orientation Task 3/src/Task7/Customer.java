package Task7;

public class Customer {
    int id;
    int startTime;
    long endTime = 0;

    Customer(int id, int startTime) {
        this.id = id;
        this.startTime = startTime;
    }

    int getId() {
        return id;
    }

    void setStartTime(int startTime) {
        this.startTime = startTime;
    }

    long getStartTime() {
        return startTime;
    }

    void setEndTime(int endTime) {
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