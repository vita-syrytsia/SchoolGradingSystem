package by_features.student.adapter.out.persistence.load;

import by_features.student.domain.Class;
import by_features.student.domain.SortOrder;
import by_features.student.domain.Student;
import by_features.student.domain.Subject;
import by_features.student.domain.port.out.load.GetSortedByMarksPort;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
class GetSortedByMarksAdapter implements GetSortedByMarksPort {

    @Override
    public List<Student> getSortedByMarks(
        Class targetClass,
        Subject subject,
        LocalDate from,
        LocalDate to,
        SortOrder sortOrder
    ) {
        return null;
    }
}
