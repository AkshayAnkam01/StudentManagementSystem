import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        StudentManager manager = new StudentManager();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n1. Add Student\n2. Remove Student\n3. Search Student\n4. List Students\n5. Exit");
            System.out.print("Enter choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter ID: ");
                    int id = scanner.nextInt();
                    scanner.nextLine(); // consume newline
                    System.out.print("Enter Name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter Course: ");
                    String course = scanner.nextLine();
                    manager.addStudent(new Student(id, name, course));
                    break;

                case 2:
                    System.out.print("Enter ID to remove: ");
                    int removeId = scanner.nextInt();
                    manager.removeStudent(removeId);
                    break;

                case 3:
                    System.out.print("Enter ID to search: ");
                    int searchId = scanner.nextInt();
                    manager.searchStudent(searchId);
                    break;

                case 4:
                    manager.listStudents();
                    break;

                case 5:
                    System.out.println("Exiting...");
                    scanner.close(); // ✅ Fixed: Close the scanner before exit
                    return;

                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}
