package by_features.student.domain.service;

import by_features.student.domain.port.in.update.UpdateStudentDetailsCommand;
import by_features.student.domain.port.in.update.UpdateStudentDetailsUseCase;
import by_features.student.domain.port.out.update.UpdateStudentDetailsPort;
import org.springframework.stereotype.Service;

@Service
public class UpdateStudentDetailsService implements UpdateStudentDetailsUseCase {
    private final UpdateStudentDetailsPort updateStudentDetailsPort;

    public UpdateStudentDetailsService(UpdateStudentDetailsPort updateStudentDetailsPort) {
        this.updateStudentDetailsPort = updateStudentDetailsPort;
    }

    @Override
    public void update(UpdateStudentDetailsCommand updateStudentDetailsCommand) {

    }
}
