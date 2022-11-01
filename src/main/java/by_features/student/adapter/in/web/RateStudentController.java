package by_features.student.adapter.in.web;

import by_features.student.application.port.in.rate.RateStudentUseCase;
import org.springframework.stereotype.Controller;

@Controller
public class RateStudentController {
    private final RateStudentUseCase rateStudentUseCase;

    public RateStudentController(RateStudentUseCase rateStudentUseCase) {
        this.rateStudentUseCase = rateStudentUseCase;
    }
}
