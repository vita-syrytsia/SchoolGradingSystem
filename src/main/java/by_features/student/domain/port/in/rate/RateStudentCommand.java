package by_features.student.domain.port.in.rate;

import org.springframework.lang.NonNull;

import java.time.LocalDate;

public class RateStudentCommand {
    private final int studentId;
    @NonNull
    private final String subject;
    @NonNull
    private final String grade;
    @NonNull
    private final LocalDate date;

    public RateStudentCommand(int studentId, @NonNull String subject, @NonNull String grade, @NonNull LocalDate date) {
        this.studentId = studentId;
        this.subject = subject;
        this.grade = grade;
        this.date = date;
    }

    public int getStudentId() {
        return studentId;
    }

    @NonNull
    public String getSubject() {
        return subject;
    }

    public String getGrade() {
        return grade;
    }

    @NonNull
    public LocalDate getDate() {
        return date;
    }
}
