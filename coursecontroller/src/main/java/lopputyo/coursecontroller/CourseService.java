package lopputyo.coursecontroller;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;



@Service
public class CourseService implements ICourseService {

List<Student> students = new ArrayList<>();
List<Course> courses = new ArrayList<>();
    
CourseFileService courseFileService = new CourseFileService();

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }

   
    @Override
    public List<Student> getStudents() {
       return students;     

    }

    @Override
    public List<Course> getCourses() {
        return courses;
    }

    @Override
    public Student getStudentsById(long studentId) {
        for(Student a: students)
        {
            if(a.getStudentId() == studentId){
                return a;
            }
        }
        return null;
    }

    @Override
    public Course getCourseById(long courseId) {
        for(Course b: courses){
            if(b.getCourseId() == courseId){
                return b;
            }
        }
        return null;
    }

    @Override
    public List<Course> getCoursesOfStudent(long studentId) {
         return null;
    }

    @Override
    public boolean addStudentToCourse(long studentId, long courseId) {
        // TODO Auto-generated method stub
        return false;
    }
    
}
