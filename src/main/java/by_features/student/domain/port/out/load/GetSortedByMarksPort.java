package by_features.student.domain.port.out.load;

import by_features.student.domain.Class;
import by_features.student.domain.SortOrder;
import by_features.student.domain.Student;
import by_features.student.domain.Subject;

import java.time.LocalDate;
import java.util.List;

public interface GetSortedByMarksPort {
    List<Student> getSortedByMarks(Class targetClass, Subject subject, LocalDate from, LocalDate to, SortOrder sortOrder);
}
