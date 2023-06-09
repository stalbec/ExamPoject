package classes;

public class Lesson {
    private int id;
    private String lessonName;
    private String description;

    public Lesson(int id, String lessonName, String description) {
        this.id = id;
        this.lessonName = lessonName;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLessonName() {
        return lessonName;
    }

    public void setLessonName(String lessonName) {
        this.lessonName = lessonName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Lesson{" +
                "id=" + id +
                ", lessonName='" + lessonName + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
