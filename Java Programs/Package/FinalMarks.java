import CIE.Internals;
import SEE.External;

import java.util.Scanner;

public class FinalMarks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int n = scanner.nextInt();

        Internals[] internalStudents = new Internals[n];
        External[] externalStudents = new External[n];

        // Input details for each student
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for student " + (i + 1));

            System.out.print("Enter USN: ");
            String usn = scanner.next();

            System.out.print("Enter Name: ");
            String name = scanner.next();

            System.out.print("Enter Semester: ");
            int sem = scanner.nextInt();

            // Internal marks input
            int[] internalMarks = new int[5];
            System.out.println("Enter internal marks for 5 courses:");
            for (int j = 0; j < 5; j++) {
                internalMarks[j] = scanner.nextInt();
            }
            internalStudents[i] = new Internals(usn, name, sem, internalMarks);

            // SEE marks input
            int[] seeMarks = new int[5];
            System.out.println("Enter SEE marks for 5 courses:");
            for (int j = 0; j < 5; j++) {
                seeMarks[j] = scanner.nextInt();
            }
            externalStudents[i] = new External(usn, name, sem, seeMarks);
        }

        // Calculate and display final marks for each student
        for (int i = 0; i < n; i++) {
            System.out.println("\nFinal marks for student " + (i + 1));
            internalStudents[i].displayPersonalDetails();
            int[] internalMarks = internalStudents[i].getInternalMarks();
            int[] seeMarks = externalStudents[i].getSeeMarks();

            System.out.println("Course-wise Final Marks:");
            for (int j = 0; j < 5; j++) {
                int finalMark = internalMarks[j] + (seeMarks[j] / 2);
                System.out.println("Course " + (j + 1) + ": " + finalMark);
            }
        }

        scanner.close();
    }
}
