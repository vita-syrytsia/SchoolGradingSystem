package by_features.student.adapter.out.persistence.load;

import by_features.student.application.port.out.load.GetWithMarksHigherThanPort;
import by_features.student.domain.Class;
import by_features.student.domain.Grade;
import by_features.student.domain.Student;
import by_features.student.domain.Subject;
import java.time.LocalDate;
import java.util.List;
import org.springframework.stereotype.Repository;

@Repository
class GetWithMarksHigherThanAdapter implements GetWithMarksHigherThanPort {

    @Override
    public List<Student> getWithMarksHigherThan(
        Grade targetGrade,
        Class targetClass,
        Subject subject,
        LocalDate from,
        LocalDate to
    ) {
        return null;
    }
}
