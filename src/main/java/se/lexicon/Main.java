package se.lexicon;

public class Main {
    public static void main(String[] args) {
        //System.out.println("Hello world!");

        GradeBook myGradeBook = new GradeBook("1DT Systeme of Information");

        myGradeBook.displayMessage();
        myGradeBook.determineAverageGrade();
    }
}