package by_layers.persistence;

import by_layers.domain.Class;
import by_layers.domain.Grade;
import by_layers.domain.Mark;
import by_layers.domain.SortOrder;
import by_layers.domain.Student;
import by_layers.domain.StudentRepository;
import by_layers.domain.Subject;
import java.time.LocalDate;
import java.util.List;
import org.springframework.stereotype.Repository;

@Repository
class StudentRepositoryImpl implements StudentRepository {
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
