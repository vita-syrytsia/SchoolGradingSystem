package by_features.student.adapter.out.persistence.load;

import by_features.student.domain.Class;
import by_features.student.domain.Grade;
import by_features.student.domain.Student;
import by_features.student.domain.Subject;
import by_features.student.domain.port.out.load.GetWithMarksHigherThanPort;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

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
