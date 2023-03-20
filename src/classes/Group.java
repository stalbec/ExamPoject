package classes;

import java.util.List;

public class Group {
    private int id;
    private String groupName;
    private String description;
    private List<Lesson>lessons;
    private List<Student>students;

    public Group(int id, String groupName, String description, List<Lesson> lessons, List<Student> students) {
        this.id = id;
        this.groupName = groupName;
        this.description = description;
        this.lessons = lessons;
        this.students = students;
    }

    public Group() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Lesson> getLessons() {
        return lessons;
    }

    public void setLessons(List<Lesson> lessons) {
        this.lessons = lessons;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    @Override
    public String toString() {
        return "Group{" +
                "id=" + id +
                ", groupName='" + groupName + '\'' +
                ", description='" + description + '\'' +
                ", lessons=" + lessons +
                ", students=" + students +
                '}';
    }
}
