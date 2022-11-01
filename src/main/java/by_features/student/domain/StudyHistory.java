package by_features.student.domain;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class StudyHistory {
    private final Map<Class, Set<SubjectHistory>> history = new HashMap<>();

    public Map<Class, Set<SubjectHistory>> getHistory() {
        return history;
    }
}
