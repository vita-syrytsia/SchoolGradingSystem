package by_features.student.adapter.out.persistence.load;

import by_features.student.application.port.out.load.GetSortedByMarksPort;
import by_features.student.domain.Class;
import by_features.student.domain.SortOrder;
import by_features.student.domain.Student;
import by_features.student.domain.Subject;
import java.time.LocalDate;
import java.util.List;
import org.springframework.stereotype.Repository;

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
