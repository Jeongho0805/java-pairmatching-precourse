package pairmatching.type;

import java.util.ArrayList;
import java.util.List;

public enum Course {

    BACKEND("백엔드"),
    FRONTEND("프론트엔드");

    private final String name;

    Course(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public static List<String> getCourseNames() {
        List<String> courseNames = new ArrayList<>();
        for (Course course : Course.values()) {
            courseNames.add(course.getName());
        }
        return courseNames;
    }
}
