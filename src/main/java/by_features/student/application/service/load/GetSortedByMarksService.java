package by_features.student.application.service.load;

import by_features.student.application.port.in.load.GetSortedByMarksCommand;
import by_features.student.application.port.in.load.GetSortedByMarksUseCase;
import by_features.student.application.port.out.load.GetSortedByMarksPort;
import by_features.student.domain.Student;
import java.util.List;
import org.springframework.stereotype.Service;

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
