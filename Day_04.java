package recordsystem;

import java.util.HashMap;
import java.util.Map;

public class Student {
    private String id;
    private String name;
    private Map<String, Double> marks;

    public Student(String id, String name) {
        this.id = id;
        this.name = name;
        this.marks = new HashMap<>();
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void addMark(String subject, double score) {
        marks.put(subject, score);
    }

    public Map<String, Double> getMarks() {
        return marks;
    }

    public double calculateAverage() {
        if (marks.isEmpty()) {
            return 0.0;
        }
        double sum = 0;
        for (double score : marks.values()) {
            sum += score;
        }
        return sum / marks.size();
    }
}
