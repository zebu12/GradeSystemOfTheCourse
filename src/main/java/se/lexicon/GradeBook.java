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
        int counter = 1;
        int average = 0;
        int grade;
        Scanner scanner = new Scanner(System.in);

        while (counter <= 10) {

            System.out.print("Enter the Grade ");
            grade = scanner.nextInt();
            total = total + grade;
            counter++;
        }
        average = total / counter;
        System.out.println("The average grade is " + average);
        System.out.println("The total grade is " + total);
    }
}
