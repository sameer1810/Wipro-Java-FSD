package com.grade;
import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the score: ");
        int score = scanner.nextInt();

        printGrade(score);
    }

    public static void printGrade(int score) {
        int gradeCategory = score / 10;

        switch (gradeCategory) {
            case 10:
            case 9:
                System.out.println("The grade for a score of " + score + " is A+");
                break;
            case 8:
                System.out.println("The grade for a score of " + score + " is A");
                break;
            case 7:
                System.out.println("The grade for a score of " + score + " is B");
                break;
            case 6:
                System.out.println("The grade for a score of " + score + " is C");
                break;
            case 5:
                System.out.println("The grade for a score of " + score + " is D");
                break;
            default:
                if (score < 50) {
                    System.out.println("The grade for a score of " + score + " is F"); // Fail
                } else {
                    System.out.println("Invalid score"); // Invalid score
                }
                break;
        }
    }
}