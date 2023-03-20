package interfacePackage;

import classes.Group;
import classes.Lesson;
import classes.Student;
import enums.Gender;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ServiceHubImpl implements ServiceHub {
    private final List<Group> groups = new ArrayList<>();
    List<Student> students = new ArrayList<>();
    List<Lesson> lessons = new ArrayList<>();

    @Override
    public void greeting() {
        LocalTime localTime = LocalTime.now();
        if (localTime.isBefore(LocalTime.of(9, 0))) {
            System.out.println("Good morning!" + "\nWelcome to the it school");
        } else if (localTime.isBefore(LocalTime.of(19, 0))) {
            System.out.println("Good afternoon!" + "\nWelcome to the it school");
        } else if (localTime.isBefore(LocalTime.of(22, 0))) {
            System.out.println("Good evening" + "\nWelcome to the it school");
        } else {
            System.out.println("Good night");
        }
        System.out.println("Time: " + localTime.getHour() + ":" + localTime.getMinute());

    }

    @Override
    public void addNewGroup() {
        boolean veryTrue = true;
        try {

            Group group = new Group();
            System.out.println("Please enter new name of group:  ");
            String scName = new Scanner(System.in).nextLine();
            group.setGroupName(scName);
            for (Group gr : groups) {
                if (gr.getGroupName().equalsIgnoreCase(scName)) {
                    throw new NullPointerException("There is this group");
                }
            }
            System.out.println("Please enter the description: ");
            String scanDescript = new Scanner(System.in).nextLine();
            group.setDescription(scanDescript);

            group.setId(groups.size() + 1);
            groups.add(group);
            System.out.println("The new group is created!");
            System.out.println(groups.toString());
            veryTrue = false;

        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void getGroupByName() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the name of group, what do you want to find:  ");
        String scanName = scanner.nextLine();
        for (Group gr : groups) {
            if (gr.getGroupName().equals(scanName)) {
                System.out.println(gr.toString());
            } else {
                System.out.println("There is not this group!!!");
            }
        }
    }


    @Override
    public void updateGroupName() {
        try {
            System.out.println("Witch group's name do you want to change:  ");
            Scanner scanner = new Scanner(System.in);
            String name = scanner.nextLine();
            for (Group group : groups) {
                System.out.println("измените название группы");
                if (group.getGroupName().equalsIgnoreCase(name)) {
                    System.out.println("Please enter new name of group:  ");
                    group.setGroupName(scanner.nextLine());
                    System.out.println(group.toString());
                    System.out.println("Rename the group is done");
                } else {
                    throw new NullPointerException("Please enter the name of group correctly: ");
                }
            }
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        }
    }


    @Override
    public void getAllGroups() {
        for (Group group : groups) {
            if (!groups.isEmpty()) {
                System.out.println("All groups:  " + group.toString());
            }
        }
    }

    @Override
    public void adNewStudentToGroup() {

        try {
            System.out.println("Group's name: ");
            String grName = new Scanner(System.in).nextLine();
            for (Group gr : groups) {
                if (gr.getGroupName().equalsIgnoreCase(grName)) {
                    System.out.println("The group is found" + gr.toString());
                    Student student = new Student();
                    System.out.println("Please enter the new student's  first name:  ");
                    String firstName = new Scanner(System.in).nextLine();
                    student.setFirstName(firstName);
                    System.out.println("Please enter the new student's last name:  ");
                    String lastName = new Scanner(System.in).nextLine();
                    student.setLastName(lastName);
                    System.out.println("Please enter students email");
                    String scanEmail = new Scanner(System.in).nextLine();
                    for (Group g : groups) {
                        for (Student s : students) {
                            if (scanEmail.contains("@")) {
                                student.setEmail(scanEmail);
                            } else {
                                throw new Exception("The login must have symbol '@'");
                            }
                            if (!s.getEmail().equalsIgnoreCase(scanEmail)) {
                                System.out.println("True");

                            } else {
                                throw new Exception("There is the same email!!!");
                            }
                        }
                    }


                    System.out.println("Please enter the password:  ");
                    String password = new Scanner(System.in).nextLine();
                    if (password.length() >= 7) {
                        student.setPassword(password);
                    } else {
                        throw new Exception("The password must have at least seven characters");
                    }
                    gr.getStudents().add(student);
                    System.out.println("It's good job");
                    System.out.println(gr.toString());
                } else {
                    throw new Exception("There is not this group!!!");
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }


    @Override
    public void updateStudent() {
        try {
            System.out.println("Please enter student's name,which do you want to change:  ");
            Scanner scanner = new Scanner(System.in);
            String name = scanner.nextLine();
            for (Student student : students) {
                System.out.println("измените название группы");
                if (student.getFirstName().equalsIgnoreCase(name)) {
                    System.out.println("Please enter the student's new name:  ");
                    student.setFirstName(scanner.nextLine());
                    System.out.println(student.toString());
                    System.out.println("Rename the student is done");
                } else {
                    throw new Exception("Please enter the name of student correctly: ");
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }


    @Override
    public void findStudentByFirstName() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the name of student, what do you want to find:  ");
        String firstName = scanner.nextLine();
        for (Student student : students) {
            if (student.getFirstName().equalsIgnoreCase(firstName)) {
                System.out.println(student.toString());
            } else {
                System.out.println("There is not this student!!!");
            }
        }
    }

    @Override
    public void getAllStudentsByGroupName() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the group name:  ");
        String scanName = scanner.nextLine();
        for (Group gr : groups) {
            if (gr.getGroupName().equalsIgnoreCase(scanName)) {
                System.out.println(gr.toString());
            } else {
                System.out.println("There is not this group!!!");
            }
            if (!groups.isEmpty()) {
                System.out.println("All students:  " + students.toString());

            }

        }
    }


    @Override
    public void getAllStudentsLesson() {
        for (Lesson lesson : lessons) {
            if (!lessons.isEmpty()) {
                System.out.println("All lessons:  " + lesson.toString());
            }
        }
    }

    @Override
    public void deleteStudent() {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please enter the students name:  ");
            String firstName = scanner.nextLine();
            System.out.println("Please enter the students lastName:  ");
            String lastName = scanner.nextLine();
            for (Group group : groups) {
                for (Student student : group.getStudents()) {
                    if (student.getFirstName().equalsIgnoreCase(firstName)) {
                        group.getStudents().remove(student);
                    } else {
                        throw new Exception("There is not this student!!!");
                    }
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void addNewLessonToGroup() {

    }

    @Override
    public void getLessonByName() {

    }

    @Override
    public void getAllLessonByGroupName() {

    }

    @Override
    public void deleteLesson() {

    }

    @Override
    public void deleteGroup() {
        try {
            System.out.println("Please enter the group, what do you want to remove:  ");
            String scanName = new Scanner(System.in).nextLine();
            for (Group group : groups) {
                if (group.getGroupName().equalsIgnoreCase(scanName)) {
                    groups.remove(group);
                }
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}