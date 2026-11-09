
public class StepTracker {

    private int minSteps;
    private int totalSteps;
    private int days;
    private int active;

    public StepTracker(int steps) {
        minSteps = steps;
        totalSteps = 0;
        days = 0;
        active = 0;
    }
     public void addDailySteps(int steps) {
        totalSteps = totalSteps + steps;
        days++;

        if (steps >= minSteps) {
            active++;
        }
    }

    public int activeDays() {
        return active;
    }

    public double averageSteps() {
        if (days == 0) {
            return 0.0;
        }

        return (double) totalSteps / days;
    }
}
