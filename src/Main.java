import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        StudentManagementSystem sms = new StudentManagementSystem();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Add student");
            System.out.println("2. List student");
            System.out.println("3. Update student");
            System.out.println("4. Delete student");
            System.out.println("5. Log out");
            System.out.println("YOUR CHOICE ? : ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            boolean isExit = false;

            switch (choice) {
                case 1:
                    System.out.print("Student name:");
                    String name = scanner.nextLine();
                    System.out.print("Student email:");
                    String email = scanner.nextLine();
                    sms.addStudent(name, email);
                    break;

                case 2:
                    sms.listStudents();

                case 3:
                    System.out.print("Student id:");
                    int updateId = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Student new name:");
                    String newName = scanner.nextLine();
                    System.out.print("Student new email:");
                    String newMail = scanner.nextLine();
                    sms.updateStudent(updateId, newName, newMail);
                    break;

                case 4:
                    System.out.print("id of the student to be deleted:");
                    int deleteId = scanner.nextInt();
                    sms.deleteStudent(deleteId);
                    break;

                case 5:
                    System.out.println("logging out... ");
                    isExit = true;
                    break;

                default:
                    System.out.println("invalid choice thus try again please !");
            }
            if (isExit) {
                break;
            }
        }
    }
}