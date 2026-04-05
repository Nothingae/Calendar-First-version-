import java.util.Scanner;

public class CalendarApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the month for the calendar: ");
        String month = scanner.nextLine();

        EventCalendar eventCalendar = new EventCalendar(month);

        int choice;
        do {
            System.out.println("1. View Calendar");
            System.out.println("2. Add Event");
            System.out.println("3. Modify Event");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    eventCalendar.printCalendar();
                    break;
                case 2:
                    System.out.print("Enter the day to add event (1-31): ");
                    int addDay = scanner.nextInt();
                    scanner.nextLine(); 
                    System.out.print("Enter the event: ");
                    String addEvent = scanner.nextLine();
                    eventCalendar.addEvent(addDay, addEvent);
                    break;
                case 3:
                    System.out.print("Enter the day to modify event (1-31): ");
                    int modifyDay = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter the new event: ");
                    String newEvent = scanner.nextLine();
                    eventCalendar.modifyEvent(modifyDay, newEvent);
                    break;
                case 4:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        } while (choice != 4);

        scanner.close();
    }
}
