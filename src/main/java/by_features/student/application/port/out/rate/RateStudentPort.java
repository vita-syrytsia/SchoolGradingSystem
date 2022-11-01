package by_features.student.application.port.out.rate;

import by_features.student.domain.Mark;
import by_features.student.domain.Subject;

public interface RateStudentPort {
    void rate(int studentId, Subject subject, Mark mark);
}
