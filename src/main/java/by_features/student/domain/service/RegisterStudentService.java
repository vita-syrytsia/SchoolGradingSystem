package by_features.student.domain.service;

import by_features.student.domain.port.in.register.RegisterStudentCommand;
import by_features.student.domain.port.in.register.RegisterStudentUseCase;
import by_features.student.domain.port.out.register.RegisterStudentPort;
import org.springframework.stereotype.Service;

@Service
public class RegisterStudentService implements RegisterStudentUseCase {
    private final RegisterStudentPort registerStudentPort;

    public RegisterStudentService(RegisterStudentPort registerStudentPort) {
        this.registerStudentPort = registerStudentPort;
    }

    @Override
    public void register(RegisterStudentCommand registerStudentCommand) {

    }
}
