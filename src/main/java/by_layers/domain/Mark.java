package by_layers.domain;

import java.time.LocalDate;

public class Mark {
    private final Grade grade;
    private final LocalDate date;

    public Mark(Grade grade, LocalDate date) {
        this.grade = grade;
        this.date = date;
    }

    public Grade getGrade() {
        return grade;
    }

    public LocalDate getDate() {
        return date;
    }
}
