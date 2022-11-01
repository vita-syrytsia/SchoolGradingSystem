package by_features.student.adapter.out.persistence;

import by_features.student.application.port.out.rate.RateStudentPort;
import by_features.student.domain.Mark;
import by_features.student.domain.Subject;
import org.springframework.stereotype.Repository;

@Repository
class RateStudentAdapter implements RateStudentPort {
    @Override
    public void rate(int studentId, Subject subject, Mark mark) {

    }
}
