import java.util.Scanner;

/**
 * Instructions:
 * - Complete the WeeklyData.java class first.
 * - Use this App class to collect user input and test your WeeklyData methods.
 * - Follow all TODOs carefully.
 * - Do NOT hard-code values — use loops and method calls.
 */
public class App {

    public static void main(String[] args) {

        // -------------------------------------------------------------
        // TODO 1: Create a Scanner for user input
        // -------------------------------------------------------------
        Scanner scanner = new Scanner(System.in);

        // -------------------------------------------------------------
        // TODO 2: Give information about your program
        //         Ask the user about their goals (if applicable)
        // -------------------------------------------------------------
        System.out.println("This program will help you analyze your weekly screentime.");
        System.out.println("Please enter your weekly goal time to be under for the week.");
        System.out.print("Weekly goal in hours: ");
        double goal = scanner.nextDouble();


        // -------------------------------------------------------------
        // TODO 3: Create an array to hold 7 days of data
        //         Use an appropriate data type (int or double)
        //         Name the array weekData
        // -------------------------------------------------------------
        double[] weekData = new double[7];
        String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        // -------------------------------------------------------------
        // TODO 4: Use a for loop to collect data for each day of the week
        //         Prompt example:
        //         "Enter <data type> for day X: "
        //
        //         Include input validation:
        //         - Use a while loop to prevent negative values
        //         - Re-prompt if the value is invalid
        // -------------------------------------------------------------
        for (int i = 0; i < weekData.length; i++) {
            System.out.print("Enter screentime hours for " + days[i] + ": ");
            double input = scanner.nextDouble();
            while (input < 0) {
                System.out.print("Invalid input. Please enter a non-negative value for " + days[i] + ": ");
                input = scanner.nextDouble();
            }
            weekData[i] = input;
        }


        // -------------------------------------------------------------
        // TODO 5: Create a WeeklyData object
        //         Pass the weekData array into the constructor
        // -------------------------------------------------------------
        WeeklyData weeklyData = new WeeklyData(weekData);

        // -------------------------------------------------------------
        // TODO 6: Display the results of the analysis
        //         Call methods from WeeklyData to display:
        //         - Total
        //         - Average
        //         - Minimum
        //         - Maximum
        //
        //         Use clear labels and formatted output if needed
        // -------------------------------------------------------------
        System.out.println("Total amount of screentime this week: " + weeklyData.getTotal() + " hours");
        System.out.println("Average daily screentime: " + weeklyData.getAverage() + " hours");
        System.out.println("Maximum screentime in a day: " + weeklyData.getMax() + " hours");
        System.out.println("Minimum screentime in a day: " + weeklyData.getMin() + " hours");


        // -------------------------------------------------------------
        // TODO 7: Display the full week of data
        //         Use the toString() method from WeeklyData
        // -------------------------------------------------------------
        weeklyData.toString();


        // -------------------------------------------------------------
        // TODO 8: Give the user insights about their week
        //         --> "You need to drink more water next week!"
        //         --> "You were very hydrated this week!"
        //         --> etc.
        // -------------------------------------------------------------

        if (weeklyData.getTotal() > goal) {
            System.out.println("You spent a lot of time on screens this week! Consider taking breaks.");
        } else {
            System.out.println("Great job keeping your screentime under control this week!");
        }


    }
}
