package by_features.student.adapter.out.persistence;

import by_features.student.application.port.out.register.RegisterStudentPort;
import by_features.student.domain.Student;
import org.springframework.stereotype.Repository;

@Repository
class RegisterStudentAdapter implements RegisterStudentPort {
    @Override
    public void register(Student student) {

    }
}
