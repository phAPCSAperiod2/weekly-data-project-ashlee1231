/**
 * The WeeklyData class stores and analyzes a week's worth of numeric data.
 * This could represent steps taken, hours of sleep, money spent, screen time,
 * or any other measurable daily value.
 */
public class WeeklyData {

    // Instance Variables
    private double[] hoursList;

    /**
     * Constructs a WeeklyData object by taking in an array of values
     * and making a deep copy (element-by-element) into the internal array.
     *
     * @param input an array representing 7 days of data
     */
    public WeeklyData(double[] input) {
        this.hoursList = new double[input.length];
        for (int i = 0; i < input.length; i++) {
            this.hoursList[i] = input[i];
        } 
    }

    /**
     * Calculates and returns the total of all values in the week.
     *
     * @return the sum of all values in the data array
     */
    public double getTotal() {
        double sum = 0;
        for (double hour : hoursList) {
            sum += hour;
        }
        return sum;
    }

    /**
     * Calculates and returns the average value for the week.
     *
     * @return the average of the values in the array,
     *         or 0.0 if the array is empty
     */
    public double getAverage() {
        if (hoursList.length == 0) {
            return 0.0;
        }
        else {
            return getTotal() / hoursList.length;
        }
    }

    /**
     * Finds and returns the highest value in the data array.
     *
     * @return the maximum value
     */
    public double getMax() {
        double max = hoursList[0];
        for (int i = 1; i < hoursList.length; i++) {
            if (hoursList[i] > max) {
                max = hoursList[i];
            }
        }
        return max;
    }

    /**
     * Finds and returns the lowest value in the data array.
     *
     * @return the minimum value
     */
    public double getMin() {
        double min = hoursList[0];
        for (int i = 1; i < hoursList.length; i++) {
            if (hoursList[i] < min) {
                min = hoursList[i];
            }
        }
        return min;
    }

    /**
     * Returns a formatted, multi-line String showing each day's data.
     *
     * Example:
     * Day 1: 4500
     * Day 2: 6200
     * Day 3: 5100
     *
     * @return a formatted String representing the week's data
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < hoursList.length; i++) {
            sb.append("Day " + (i + 1) + ": " + hoursList[i] + "\n");
        }
        String finalString = sb.toString();
        return finalString;
    }
}
