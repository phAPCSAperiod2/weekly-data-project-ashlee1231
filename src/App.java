import java.util.Scanner;


/**
 * The App class serves as the main entry point for the Weekly Screentime Analysis program.
 * It prompts the user for their weekly screentime goal and daily screentime data,
 * then analyzes and displays statistics using the WeeklyData class.
 *
 * @author Ashlynn Kirchoff
 * @collaborators GitHub Copilot
 * @version 1.0
 */

public class App {

    /**
     * The main method is the entry point of the application.
     * It handles user input for screentime data and outputs analysis results.
     *
     * @param args command-line arguments (not used in this program)
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("This program will help you analyze your weekly screentime.");
        System.out.println("Please enter your weekly goal time to be under for the week.");
        System.out.print("Weekly goal in hours: ");
        double goal = scanner.nextDouble();
        if (goal < 0) {
            System.out.println("Invalid input. Setting weekly goal to 0 hours.");
            goal = 0;
        }

        double[] weekData = new double[7];
        String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        for (int i = 0; i < weekData.length; i++) {
            System.out.print("Enter screentime hours for " + days[i] + ": ");
            double input = scanner.nextDouble();
            while (input < 0) {
                System.out.print("Invalid input. Please enter a non-negative value for " + days[i] + ": ");
                input = scanner.nextDouble();
            }
            weekData[i] = input;
        }

        WeeklyData weeklyData = new WeeklyData(weekData);

        System.out.println("");
        System.out.println("Total amount of screentime this week: " + weeklyData.getTotal() + " hours");
        System.out.println("Average daily screentime: " + weeklyData.getAverage() + " hours");
        System.out.println("Maximum screentime in a day: " + weeklyData.getMax() + " hours");
        System.out.println("Minimum screentime in a day: " + weeklyData.getMin() + " hours");
        System.out.println("");

        System.out.println("");
        System.out.println("Here is your screentime data for the week:");
        System.out.println(weeklyData.toString());

        if (weeklyData.getTotal() > goal) {
            System.out.println("You spent " + (weeklyData.getTotal() - goal) + " hours over your weekly screentime goal. Try to cut back next week!");
        } else {
            System.out.println("Great job keeping your screentime under control this week!");
        }


    }
}
