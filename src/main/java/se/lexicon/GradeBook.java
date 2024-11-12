package se.lexicon;

import java.util.Scanner;

public class GradeBook {

    private String courseName;

    public GradeBook(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }


    public void displayMessage() {
        System.out.println("Course Name: " + this.courseName);
    }

    public void determineAverageGrade() {

        int total = 0;
        int counter = 0;
        double average;
        int grade = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the Grade or -1 to exit: ");
        grade = scanner.nextInt();

        while (grade != -1) {
            total = total + grade;
            counter++;
            System.out.print("Enter the Grade or -1 to exit: ");
            grade = scanner.nextInt();

        }
        if (counter != 0) {

            average = (1.0 * total) / counter;
            System.out.println("The total grade is " + total);
            System.out.println("The average grade is " + average);


        } else {

            System.out.println("no grade were found");

        }
    }
}
