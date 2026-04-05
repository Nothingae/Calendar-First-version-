public class Calendar {
    protected String[][] calendar;
    protected String month;

    public Calendar(String month) {
        this.month = month;
        this.calendar = new String[5][7]; 
    }

    public void printCalendar() {
        System.out.println("----- " + month + " -----");
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");

        int day = 1;

        for (int i = 0; i < calendar.length; i++) {
            for (int j = 0; j < calendar[i].length; j++) {
                if (day <= 31) {
                    if (day < 10) {
                        System.out.print(" " + day + "   ");
                    } else {
                        System.out.print(day + "   ");
                    }
                    day++;
                } else {
                    System.out.print("     ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }
}
