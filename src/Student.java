import java.util.Scanner;

public class Student {
    private String firstName;
    private String lastName;
    private int gradeYear;
    private String studentID;
    private String courses;
    private int tuitionBalance;
    private static int costOfCourse = 600;
    private static int id = 1001;

    public Student() {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter student first name: ");
        this.firstName = in.nextLine();

        System.out.print("Enter student last name: ");
        this.lastName = in.nextLine();

        System.out.print("1 - Freshmen\n2 - Sophmore\n3 - Junior\n4 - Senior\nEnter student class level: ");
        this.gradeYear = in.nextInt();

        setSudentID();

        System.out.println(firstName + " " + lastName + " " + gradeYear + " " + studentID);
    }

    private void setSudentID() {
        id++;
        this.studentID = gradeYear + "" + id;
    }
}
