package Task5;

public class Task5 {
    public static void main(String[] args) {
        Clock.getInstance();

        System.out.println("Current Time: " + Clock.getInstance().getTime());

        System.out.println("Advancing time by 5000");

        Clock.getInstance().changeTime(5000);

        System.out.println("Current Time: " + Clock.getInstance().getTime());
    }

}
