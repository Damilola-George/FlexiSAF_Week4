// Enum for Days of the Week
enum Day {
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY;
}

// Superclass
class Week {
    protected Day day;

    public Week(Day day) {
        this.day = day;
    }

    public void displayDay() {
        System.out.println("The day is: " + day);
    }
}

// Subclass
class DayDisplay extends Week {
    public DayDisplay(Day day) {
        super(day);
    }

    // Overriding method to provide additional behavior
    @Override
    public void displayDay() {
        System.out.print("Displaying: ");
        super.displayDay();
    }
}

// Main class
public class DaysOfWeekDemo {
    public static void main(String[] args) {
        // Loop through all days in the enum
        for (Day d : Day.values()) {
            DayDisplay dayDisplay = new DayDisplay(d);
            dayDisplay.displayDay();
        }
    }
}
