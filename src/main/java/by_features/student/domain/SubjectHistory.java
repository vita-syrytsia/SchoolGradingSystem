package by_features.student.domain;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class SubjectHistory {
    private final Subject subject;
    private final Set<Mark> marks = new HashSet<>();

    public SubjectHistory(Subject subject) {
        this.subject = subject;
    }

    public Subject getSubject() {
        return subject;
    }

    public Set<Mark> getMarks() {
        return marks;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SubjectHistory that = (SubjectHistory) o;
        return subject == that.subject;
    }

    @Override
    public int hashCode() {
        return Objects.hash(subject);
    }
}
