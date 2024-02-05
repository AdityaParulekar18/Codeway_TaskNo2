import java.util.*;

public class Marks 
{
    public static void main(String args[]) 
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter marks in 1st subject (out of 100): ");
        float a = scanner.nextFloat();

        System.out.print("Enter marks in 2nd subject (out of 100): ");
        float b = scanner.nextFloat();

        System.out.print("Enter marks in 3rd subject (out of 100): ");
        float c = scanner.nextFloat();

        System.out.print("Enter marks in 4th subject (out of 100): ");
        float d = scanner.nextFloat();

        System.out.print("Enter marks in 5th subject (out of 100): ");
        float e = scanner.nextFloat();

        System.out.print("Enter marks in 6th subject (out of 100): ");
        float f = scanner.nextFloat();

        float totalMarks = a + b + c + d + e + f;
        System.out.println("Total Marks of this Student is: " + totalMarks + " Out of 600");

        float averageMarks = totalMarks / 6;
        System.out.println("Average Marks of this Student is: " + averageMarks);

        float percentage = (totalMarks / 600) * 100;
        System.out.println("Percentage of this Student is: " + percentage);

        char grade = calculateGrade(percentage);
        System.out.println("Grade of this Student is: " + grade);

        scanner.close();
    }

    private static char calculateGrade(float percentage) 
    {
        if (percentage >= 90) {
            return 'A';
        } 
        else if (percentage >= 80) {
            return 'B';
        } 
        else if (percentage >= 70) {
            return 'C';
        } 
        else if (percentage >= 60) {
            return 'D';
        } 
        else if (percentage >= 40) {
            return 'E';
        } 
        else {
            return 'F';
        }
    }
}
