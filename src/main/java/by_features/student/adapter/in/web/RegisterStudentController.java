package by_features.student.adapter.in.web;

import by_features.student.application.port.in.register.RegisterStudentUseCase;
import org.springframework.stereotype.Controller;

@Controller
public class RegisterStudentController {
    private final RegisterStudentUseCase registerStudentUseCase;

    public RegisterStudentController(RegisterStudentUseCase registerStudentUseCase) {
        this.registerStudentUseCase = registerStudentUseCase;
    }
}
