package sabyrzhanov.dao;

import sabyrzhanov.entities.Course;

public interface CourseDAO {

    void addCourse(Course course);

    Course getCourseById(Long id);

    void updateCourse(Course course);

    void deleteCourse(Course course);
}
