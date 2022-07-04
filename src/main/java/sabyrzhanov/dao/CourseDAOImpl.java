package sabyrzhanov.dao;


import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import sabyrzhanov.entities.Course;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
@Transactional
public class CourseDAOImpl implements CourseDAO {

    @PersistenceContext
    private EntityManager entityManager;


    @Override
    public void addCourse(Course course) {
        entityManager.persist(course);
    }

    @Override
    public Course getCourseById(Long id) {
        return entityManager.find(Course.class, id);
    }

    @Override
    public void updateCourse(Course course) {
        entityManager.merge(course);
    }

    @Override
    public void deleteCourse(Course course) {
        entityManager.remove(entityManager.contains(course) ? course : entityManager.merge(course));
    }
}
