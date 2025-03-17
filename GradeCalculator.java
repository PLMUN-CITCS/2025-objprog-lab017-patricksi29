import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        // Call the method to get student score
        int score = getStudentScore();
        
        // Call the method to calculate the grade
        String grade = calculateGrade(score);
        
        // Display the grade
        System.out.println("Your Grade is: " + grade);
    }

    // Method to get student score
    public static int getStudentScore() {
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user for their score
        System.out.print("Enter your score: ");
        
        // Read the user's input as an integer
        int score = scanner.nextInt();
        
        // Validate the score input (optional but recommended)
        while (score < 0 || score > 100) {
            System.out.println("Invalid score! Please enter a valid score between 0 and 100.");
            System.out.print("Enter your score: ");
            score = scanner.nextInt();
        }
        
        // Return the score
        return score;
    }

    // Method to calculate grade based on score
    public static String calculateGrade(int score) {
        String grade;
        
        if (score >= 90) {
            grade = "A";
        } else if (score >= 80) {
            grade = "B";
        } else if (score >= 70) {
            grade = "C";
        } else if (score >= 60) {
            grade = "D";
        } else {
            grade = "F";
        }
        
        return grade;
    }
}
