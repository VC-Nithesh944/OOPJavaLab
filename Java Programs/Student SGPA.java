package Practice;

import java.util.Scanner;

class Stud_details {
    public int marks[] = new int[6];
    public int credit[] = new int[6];
    String usn, name;
    int credits=0;
    public double sgpa;
    Scanner input = new Scanner(System.in);

    void getDetails() {
        System.out.println("Enter the details: ");
        System.out.print("Enter the name: ");
        name = input.next();
        System.out.print("Enter the Usn: ");
        usn = input.next();
        
        for (int i = 0; i < 6; i++) {
            System.out.print("Enter the Marks of Subject"+(i+1)+": ");
            marks[i] = input.nextInt();
            System.out.println("Enter the Credits of That subject: ");
            credit[i] = input.nextInt();
        }
    }

    public double Sgpa() {
        int points[] = new int[6];
        for (int i = 0; i < 6; i++) {
            if (marks[i] >= 90 && marks[i] <= 100)
                points[i] += 10;
            else if (marks[i] >= 80 && marks[i] < 90)
                points[i] += 9;
            else if (marks[i] >= 70 && marks[i] < 80)
                points[i] += 8;
            else if (marks[i] >= 60 && marks[i] < 70)
                points[i] += 7;
            else if (marks[i] >= 50 && marks[i] < 60)
                points[i] += 6;
            else if (marks[i] >= 40 && marks[i] < 50)
                points[i] += 5;
            else if (marks[i] >= 30 && marks[i] < 40)
                points[i] += 4;
            else if (marks[i] >= 20 && marks[i] < 30)
                points[i] += 3;
            else if (marks[i] >= 10 && marks[i] < 20)
                points[i] += 2;
            else if (marks[i] >= 0 && marks[i] < 10)
                points[i] += 1;
        }
        for (int i = 0;i<6;i++){
            credits += credit[i];
            switch(credit[i]){
                case 4: points[i] *= 4;
                        break;
                case 3: points[i] *=3;
                        break;
                case 2: points[i] *=2;
                        break;
                case 1: points[i] *=1;
                        break;
                default: System.out.println("Invalid Credits entered!!");
            }
            sgpa += points[i];
        }
        // Calculating SGPA with correct typecasting to avoid integer division
        sgpa = (double) sgpa/credits;
        return sgpa;
    }

    void display() {
        System.out.println("The details of the student are: ");
        System.out.println("USN: " + usn);
        System.out.println("Name: " + name);
        System.out.println("Marks: ");
        for (int i = 0; i < 6; i++) {
            System.out.println("Subject " + (i + 1) + ": " + marks[i]);
        }
        System.out.println(String.format("Your SGPA is: %.3f",Sgpa()));
    }
}

public class Student{
    public static void main(String[] args) {
        Stud_details s[] = new Stud_details[3];  // Array for 3 students

        for (int i = 0; i < 1; i++) {
            System.out.println("Enter the details of student " + (i + 1) + ":");
            s[i] = new Stud_details();
            s[i].getDetails();
        }

        // Displaying details of all students
        for (int i = 0; i < 1; i++) {
            System.out.println("\nDisplaying details of student " + (i + 1) + ":");
            s[i].display();
        }
    }
}
