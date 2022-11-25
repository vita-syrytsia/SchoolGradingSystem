package by_features.student.adapter.out.persistence;

import by_features.student.domain.Student;
import by_features.student.domain.port.out.register.RegisterStudentPort;
import org.springframework.stereotype.Repository;

@Repository
class RegisterStudentAdapter implements RegisterStudentPort {
    @Override
    public void register(Student student) {

    }
}
