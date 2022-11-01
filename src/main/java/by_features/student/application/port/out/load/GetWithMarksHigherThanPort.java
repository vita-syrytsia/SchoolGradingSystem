package by_features.student.application.port.out.load;

import by_features.student.domain.Class;
import by_features.student.domain.Grade;
import by_features.student.domain.Student;
import by_features.student.domain.Subject;
import java.time.LocalDate;
import java.util.List;

public interface GetWithMarksHigherThanPort {
    List<Student> getWithMarksHigherThan(Grade targetGrade, Class targetClass, Subject subject, LocalDate from, LocalDate to);
}
