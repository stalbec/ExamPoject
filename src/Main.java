import classes.Group;
import interfacePackage.ServiceHubImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //  List<Group> groups = new ArrayList<>();
        ServiceHubImpl serviceHub = new ServiceHubImpl();
        while (true) {
            System.out.println("""
                     1 -> Greeting
                     2  -> Add new group
                     3  -> Get group by name
                     4  -> Update group name
                     5  -> Get all groups
                     6  -> Add new student to group
                     7  -> Update student
                     8  -> Find student by first name
                     9  -> Get all students by group name
                     10 -> Get all student's lesson
                     11 -> Delete student from group
                     12 -> Add new lesson to group
                     13 -> Get lesson by name
                     14 -> Get all lesson by group name
                     15 -> Delete lesson from group
                     16 -> Delete group""");

            Scanner scanner = new Scanner(System.in);
            int serviceChoice = scanner.nextInt();

            switch (serviceChoice){
                case 1-> serviceHub.greeting();
                case 2-> serviceHub.addNewGroup();
                case 3-> serviceHub.getGroupByName();
                case 4-> serviceHub.updateGroupName();
                case 5-> serviceHub.getAllGroups();
                case 6-> serviceHub.adNewStudentToGroup();
                case 7-> serviceHub.updateStudent();
                case 8-> serviceHub.findStudentByFirstName();
                case 9-> serviceHub.getAllStudentsByGroupName();
                default -> System.out.println("There is not service like this!!!");
            }
        }






    }
}