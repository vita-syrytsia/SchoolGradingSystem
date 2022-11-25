package by_features.student.adapter.in.web.load;

import by_features.student.domain.port.in.load.GetWithMarksHigherThanUseCase;
import org.springframework.stereotype.Controller;

@Controller
public class GetWithMarksHigherThanController {
    private final GetWithMarksHigherThanUseCase getWithMarksHigherThanUseCase;

    public GetWithMarksHigherThanController(GetWithMarksHigherThanUseCase getWithMarksHigherThanUseCase) {
        this.getWithMarksHigherThanUseCase = getWithMarksHigherThanUseCase;
    }
}
