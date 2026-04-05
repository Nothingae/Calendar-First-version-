public class EventCalendar extends Calendar {

    public EventCalendar(String month) {
        super(month);
    }

    public void addEvent(int day, String event) {
        if (day >= 1 && day <= 31) {
            int row = (day - 1) / 7;
            int col = (day - 1) % 7;
            calendar[row][col] = event;
            System.out.println("Event added on day " + day + ": " + event);
        } else {
            System.out.println("Invalid day. Please choose a day between 1 and 31.");
        }
    }

    public void modifyEvent(int day, String newEvent) {
        if (day >= 1 && day <= 31) {
            int row = (day - 1) / 7;
            int col = (day - 1) % 7;
            if (calendar[row][col] != null) {
                System.out.println("Event on day " + day + " modified. Old Event: " + calendar[row][col] + ", New Event: " + newEvent);
                calendar[row][col] = newEvent;
            } else {
                System.out.println("No event found on day " + day + ".");
            }
        } else {
            System.out.println("Invalid day. Please choose a day between 1 and 31.");
        }
    }
}
