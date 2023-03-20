package interfacePackage;

import classes.Group;

import java.time.LocalTime;
import java.util.List;

public interface ServiceHub {

    void greeting();
    void addNewGroup();
    void getGroupByName();
    void updateGroupName();
    void getAllGroups();
    void adNewStudentToGroup();
    void updateStudent();
    void findStudentByFirstName();
    void getAllStudentsByGroupName();
    void getAllStudentsLesson();
    void deleteStudent();
    void addNewLessonToGroup();
    void getLessonByName();
    void getAllLessonByGroupName();
    void deleteLesson();
    void deleteGroup();




}
