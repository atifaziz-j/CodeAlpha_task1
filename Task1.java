//      Task#1
//Student Grade Tracker

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Prompt for the number of students
        System.out.print("Enter the number of students: ");
        int numofStudents = sc.nextInt();

        // Creating arrays to store the grades
        int[] grades = new int[numofStudents];

        // Input the grades
        for (int i = 0; i < numofStudents; i++) {
            System.out.print("Enter the grade for student " + (i + 1) + ": ");
            grades[i] = sc.nextInt();
        }

        // Computing average, highest, and lowest scores
        int sum = 0;
        int highest = grades[0];
        int lowest = grades[0];

        for (int marks  : grades) {
            sum += marks;
            if (marks > highest) {
                highest = marks;
            }
            if (marks < lowest) {
                lowest = marks;
            }
        }

        double average = (double) sum / numofStudents;

        // Display the  results
        System.out.println("Average grade: " + average);
        System.out.println("Highest grade: " + highest);
        System.out.println("Lowest grade: " + lowest);

        sc.close();
    }
}
