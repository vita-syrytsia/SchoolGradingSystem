package by_features.student.adapter.in.web;

import by_features.student.application.port.in.update.UpdateStudentDetailsUseCase;
import org.springframework.stereotype.Controller;

@Controller
public class UpdateStudentDetailsController {
    private final UpdateStudentDetailsUseCase updateStudentDetailsUseCase;

    public UpdateStudentDetailsController(UpdateStudentDetailsUseCase updateStudentDetailsUseCase) {
        this.updateStudentDetailsUseCase = updateStudentDetailsUseCase;
    }
}
