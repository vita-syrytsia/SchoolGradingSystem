package by_layers.domain;

public class Student {
    private final int id;
    private final String name;
    private final StudyHistory studyHistory = new StudyHistory();
    private Class studentClass;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Class getStudentClass() {
        return studentClass;
    }

    public void setStudentClass(Class studentClass) {
        this.studentClass = studentClass;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public StudyHistory getStudyHistory() {
        return studyHistory;
    }
}
