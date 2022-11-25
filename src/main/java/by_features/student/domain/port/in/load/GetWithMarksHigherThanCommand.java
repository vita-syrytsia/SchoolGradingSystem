package by_features.student.domain.port.in.load;

import org.springframework.lang.NonNull;

import java.time.LocalDate;

public class GetWithMarksHigherThanCommand {
    @NonNull
    private final String targetGrade;
    @NonNull
    private final String targetClass;
    @NonNull
    private final LocalDate from;
    @NonNull
    private final LocalDate to;
    private final String subject;

    public GetWithMarksHigherThanCommand(
        @NonNull String targetGrade,
        @NonNull String targetClass,
        @NonNull LocalDate from,
        @NonNull LocalDate to,
        String subject
    ) {
        this.targetGrade = targetGrade;
        this.targetClass = targetClass;
        this.from = from;
        this.to = to;
        this.subject = subject;
    }

    public GetWithMarksHigherThanCommand(
        @NonNull String targetGrade,
        @NonNull String targetClass,
        @NonNull LocalDate from,
        @NonNull LocalDate to
    ) {
        this.targetGrade = targetGrade;
        this.targetClass = targetClass;
        this.from = from;
        this.to = to;
        this.subject = null;
    }

    @NonNull
    public String getTargetGrade() {
        return targetGrade;
    }

    @NonNull
    public String getTargetClass() {
        return targetClass;
    }

    @NonNull
    public LocalDate getFrom() {
        return from;
    }

    @NonNull
    public LocalDate getTo() {
        return to;
    }

    public String getSubject() {
        return subject;
    }
}
