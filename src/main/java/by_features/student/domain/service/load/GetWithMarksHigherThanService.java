package by_features.student.domain.service.load;

import by_features.student.domain.Student;
import by_features.student.domain.port.in.load.GetWithMarksHigherThanCommand;
import by_features.student.domain.port.in.load.GetWithMarksHigherThanUseCase;
import by_features.student.domain.port.out.load.GetWithMarksHigherThanPort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GetWithMarksHigherThanService implements GetWithMarksHigherThanUseCase {
    private final GetWithMarksHigherThanPort getWithMarksHigherThanPort;

    public GetWithMarksHigherThanService(GetWithMarksHigherThanPort getWithMarksHigherThanPort) {
        this.getWithMarksHigherThanPort = getWithMarksHigherThanPort;
    }

    @Override
    public List<Student> getWithMarksHigherThan(GetWithMarksHigherThanCommand getWithMarksCommand) {
        return null;
    }
}
