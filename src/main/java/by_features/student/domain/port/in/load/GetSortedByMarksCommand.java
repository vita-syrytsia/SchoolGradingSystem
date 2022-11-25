package by_features.student.domain.port.in.load;

import org.springframework.lang.NonNull;

import java.time.LocalDate;

public class GetSortedByMarksCommand {
    @NonNull
    private final String targetClass;
    @NonNull
    private final LocalDate from;
    @NonNull
    private final LocalDate to;
    @NonNull
    private final String sortOrder;
    private final String subject;

    public GetSortedByMarksCommand(
        @NonNull String grade,
        @NonNull LocalDate from,
        @NonNull LocalDate to,
        @NonNull String sortOrder, String subject
    ) {
        this.targetClass = grade;
        this.from = from;
        this.to = to;
        this.sortOrder = sortOrder;
        this.subject = subject;
    }

    public GetSortedByMarksCommand(
        @NonNull String grade,
        @NonNull LocalDate from,
        @NonNull LocalDate to,
        @NonNull String sortOrder
    ) {
        this.targetClass = grade;
        this.from = from;
        this.to = to;
        this.sortOrder = sortOrder;
        this.subject = null;
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

    @NonNull
    public String getSortOrder() {
        return sortOrder;
    }

    public String getSubject() {
        return subject;
    }
}
