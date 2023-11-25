import java.util.*;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of subjects: ");
        int numSubjects = scanner.nextInt();
        
        int totalMarks = 0;
        int maxMarksPerSubject = 100;

        for (int i = 1; i <= numSubjects; i++) {
            System.out.print("Enter marks obtained in subject " + i + ": ");
            int marks = scanner.nextInt();
            
            // Ensure the input is within the valid range (0-100)

            if (marks < 0 || marks > maxMarksPerSubject) {
                System.out.println("Marks should be between 0 and 100. Please try again.");
                i--; // Re-enter marks for the same subject
            } else {
                totalMarks += marks;
            }
        }
        
        // Calculate average percentage

        double averagePercentage = (double) totalMarks / (numSubjects * maxMarksPerSubject) * 100;
        
        // Assign a grade based on the average percentage

        String grade;
        if (averagePercentage >= 90) {
            grade = "A+";
        } else if (averagePercentage >= 80) {
            grade = "A";
        } else if (averagePercentage >= 70) {
            grade = "B";
        } else if (averagePercentage >= 60) {
            grade = "C";
        } else {
            grade = "D";
        }
        
        // Display results
        
        System.out.println("\nResults:");
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Average Percentage: " + averagePercentage + "%");
        System.out.println("Grade: " + grade);
    }
}
