package sabyrzhanov.entities;

import javax.persistence.*;

@Entity
@Table(name = "courses")
public class Course {
    @Id
    @SequenceGenerator(
            name = "company_sequence",
            sequenceName = "company_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "company_sequence"
    )
    private Long id;

    @Column(name = "course_name")
    private String courseName;

    @Column(name = "duration_in_month")
    private String durationInMonth;

    @ManyToOne
    private Company company;

    public Course(String courseName, String durationInMonth) {
        this.courseName = courseName;
        this.durationInMonth = durationInMonth;
    }

    public Course() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getDurationInMonth() {
        return durationInMonth;
    }

    public void setDurationInMonth(String durationInMonth) {
        this.durationInMonth = durationInMonth;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }


    @Override
    public String toString() {
        return "Course{" +
                "id=" + id +
                ", courseName='" + courseName + '\'' +
                ", durationInMonth='" + durationInMonth + '\'' +
                ", company=" + company + '}';
    }
}
