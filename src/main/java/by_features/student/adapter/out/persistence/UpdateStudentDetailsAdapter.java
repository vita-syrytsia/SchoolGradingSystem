package by_features.student.adapter.out.persistence;

import by_features.student.domain.Student;
import by_features.student.domain.port.out.update.UpdateStudentDetailsPort;
import org.springframework.stereotype.Repository;

@Repository
class UpdateStudentDetailsAdapter implements UpdateStudentDetailsPort {
    @Override
    public void update(Student student) {

    }
}
