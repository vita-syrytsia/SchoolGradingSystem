package by_features.student.domain.service.load;

import by_features.student.domain.Student;
import by_features.student.domain.port.in.load.GetSortedByMarksCommand;
import by_features.student.domain.port.in.load.GetSortedByMarksUseCase;
import by_features.student.domain.port.out.load.GetSortedByMarksPort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GetSortedByMarksService implements GetSortedByMarksUseCase {
    private final GetSortedByMarksPort getSortedByMarksPort;

    public GetSortedByMarksService(GetSortedByMarksPort getSortedByMarksPort) {
        this.getSortedByMarksPort = getSortedByMarksPort;
    }

    @Override
    public List<Student> getSortedByMarks(GetSortedByMarksCommand sortCommand) {
        return null;
    }
}
