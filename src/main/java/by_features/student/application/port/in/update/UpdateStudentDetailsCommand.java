package by_features.student.application.port.in.update;

public class UpdateStudentDetailsCommand {
    private final int studentId;
    private final int studentClass;

    public UpdateStudentDetailsCommand(int studentId, int studentClass) {
        this.studentId = studentId;
        this.studentClass = studentClass;
    }

    public int getStudentId() {
        return studentId;
    }

    public int getStudentClass() {
        return studentClass;
    }
}
