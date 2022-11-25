package by_features.student.domain.port.in.load;

import by_features.student.domain.Student;

import java.util.List;

public interface GetSortedByMarksUseCase {
    List<Student> getSortedByMarks(GetSortedByMarksCommand sortCommand);
}
