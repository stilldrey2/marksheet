package marksheet;

import java.util.Scanner;

public class drey {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the number of students from the user
        System.out.print("Enter the number of students: ");
        int numStudents = scanner.nextInt();

        // Create arrays to store student information
        int[][] studentMarks = new int[numStudents][5];
        String[] studentNames = new String[numStudents];

        // Get the student details from the user
        for (int i = 0; i < numStudents; i++) {
            System.out.print("Enter the student serial number: ");
            int serialNumber = scanner.nextInt();
            studentSerialNumbers[i] = serialNumber;

            System.out.print("Enter the student name: ");
            String studentName = scanner.next();
            studentNames[i] = studentName;

            for (int j = 0; j < 5; j++) {
                System.out.print("Enter the marks for subject " + (j + 1) + ": ");
                studentMarks[i][j] = scanner.nextInt();
            }
        }

        // Compute the total and average marks for each student
        int[] studentTotals = new int[numStudents];
        double[] studentAverages = new double[numStudents];
        for (int i = 0; i < numStudents; i++) {
            int totalMarks = 0;
            for (int j = 0; j < 5; j++) {
                totalMarks += studentMarks[i][j];
            }
            studentTotals[i] = totalMarks;
            studentAverages[i] = (double) totalMarks / 5;
        }

        // Compute the average marks for each subject
        double[] subjectAverages = new double[5];
        for (int i = 0; i < 5; i++) {
            double totalMarks = 0.0;
            for (int j = 0; j < numStudents; j++) {
                totalMarks += studentMarks[j][i];
            }
            subjectAverages[i] = totalMarks / numStudents;
        }

        // Print the student mark list
        System.out.println("Welcome to Student Marklist Application");
        System.out.println("________________________________________________________________________________");
        System.out.println("SNo\tStudent Name\tSub1\tSub2\tSub3\tSub4\tSub5\tTotal\tAverage");
        System.out.println("________________________________________________________________________________");
        for (int i = 0; i < numStudents; i++) {
            System.out.printf("%d\t%s\t%d\t%d\t%d\t%d\t%d\t%d\t%.2f%n", studentSerialNumbers[i],
                    studentNames[i], studentMarks[i][0], studentMarks[i][1], studentMarks[i][2],
                    studentMarks[i][3], studentMarks[i][4], studentTotals[i], studentAverages[i]);
        }
        System.out.println("________________________________________________________________________________");

        // Print the average marks for each subject
        System.out.print("Average marks per subject");
        for (int i = 0; i < 5; i++) {
            System.out.printf("\t%.2f", subjectAverages[i]);
        }
    }
}

