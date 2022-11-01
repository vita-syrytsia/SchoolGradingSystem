package by_layers.domain;

import java.time.LocalDate;
import java.util.List;

public interface StudentRepository {
    void register(Student student);
    void update(Student student);
    void rate(int studentId, Subject subject, Mark mark);
    List<Student> getSortedByMarks(Subject subject, Class targetClass, LocalDate from, LocalDate to, SortOrder sortOrder);
    List<Student> getWithMarksHigherThan(Grade mark, Subject subject, Class targetClass, LocalDate from, LocalDate to);
}

