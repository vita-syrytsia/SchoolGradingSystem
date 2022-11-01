package by_layers.web;

import by_layers.domain.StudentService;
import org.springframework.stereotype.Controller;

@Controller
public class StudentController {
    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }
}
