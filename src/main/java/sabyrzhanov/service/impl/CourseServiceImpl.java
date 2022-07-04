package sabyrzhanov.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sabyrzhanov.dao.CourseDAO;
import sabyrzhanov.entities.Course;
import sabyrzhanov.service.CourseService;

@Service
public class CourseServiceImpl implements CourseService {

    private final CourseDAO courseDAO;

    @Autowired
    public CourseServiceImpl(CourseDAO courseDAO) {
        this.courseDAO = courseDAO;
    }

    @Override
    public void addCourse(Course course) {
        courseDAO.addCourse(course);
    }

    @Override
    public Course getCourseById(Long id) {
        return courseDAO.getCourseById(id);
    }

    @Override
    public void updateCourse(Course course) {
        courseDAO.updateCourse(course);
    }

    @Override
    public void deleteCourse(Course course) {
        courseDAO.deleteCourse(course);
    }
}