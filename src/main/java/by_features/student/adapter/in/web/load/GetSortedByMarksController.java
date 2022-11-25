package by_features.student.adapter.in.web.load;

import by_features.student.domain.port.in.load.GetSortedByMarksUseCase;
import org.springframework.stereotype.Controller;

@Controller
public class GetSortedByMarksController {
    private final GetSortedByMarksUseCase getSortedByMarksUseCase;

    public GetSortedByMarksController(GetSortedByMarksUseCase getSortedByMarksUseCase) {
        this.getSortedByMarksUseCase = getSortedByMarksUseCase;
    }
}
