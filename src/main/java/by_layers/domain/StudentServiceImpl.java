package by_layers.domain;

import java.time.LocalDate;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService {
    @Override
    public void register(Student student) {

    }

    @Override
    public void update(Student student) {

    }

    @Override
    public void rate(int studentId, Subject subject, Mark mark) {

    }

    @Override
    public List<Student> getSortedByMarks(Subject subject, Class targetClass, LocalDate from, LocalDate to, SortOrder sortOrder) {
        return null;
    }

    @Override
    public List<Student> getWithMarksHigherThan(Grade mark, Subject subject, Class targetClass, LocalDate from, LocalDate to) {
        return null;
    }
}
