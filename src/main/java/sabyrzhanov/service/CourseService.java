package sabyrzhanov.service;

import sabyrzhanov.entities.Course;

public interface CourseService {

    void addCourse(Course course);

    Course getCourseById(Long id);

    void updateCourse(Course course);

    void deleteCourse(Course course);
}
