package by_features.student.application.service;

import by_features.student.application.port.in.rate.RateStudentCommand;
import by_features.student.application.port.in.rate.RateStudentUseCase;
import by_features.student.application.port.out.rate.RateStudentPort;
import org.springframework.stereotype.Service;

@Service
public class RateStudentService implements RateStudentUseCase {
    private final RateStudentPort rateStudentPort;

    public RateStudentService(RateStudentPort rateStudentPort) {
        this.rateStudentPort = rateStudentPort;
    }

    @Override
    public void rate(RateStudentCommand rateStudentCommand) {

    }
}
