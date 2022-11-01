package by_features.student.application.port.in.register;

import org.springframework.lang.NonNull;

public class RegisterStudentCommand {
    @NonNull
    private final String name;
    private final int studentClass;

    public RegisterStudentCommand(String name, int studentClass) {
        this.name = name;
        this.studentClass = studentClass;
    }

    public String getName() {
        return name;
    }

    public int getStudentClass() {
        return studentClass;
    }
}
