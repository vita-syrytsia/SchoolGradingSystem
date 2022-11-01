package by_features.student.adapter.out.persistence;

import by_features.student.application.port.out.update.UpdateStudentDetailsPort;
import by_features.student.domain.Student;
import org.springframework.stereotype.Repository;

@Repository
class UpdateStudentDetailsAdapter implements UpdateStudentDetailsPort {
    @Override
    public void update(Student student) {

    }
}
