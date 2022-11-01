package by_features.student.application.service.load;

import by_features.student.application.port.in.load.GetWithMarksHigherThanCommand;
import by_features.student.application.port.in.load.GetWithMarksHigherThanUseCase;
import by_features.student.application.port.out.load.GetWithMarksHigherThanPort;
import by_features.student.domain.Student;
import java.util.List;
import org.springframework.stereotype.Service;

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
