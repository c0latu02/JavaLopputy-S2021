package lopputyo.coursecontroller;

import java.util.List;

public interface ICourseService {
    
    List<Student> getStudents();
    //get list of students

    List<Course> getCourses();
    //get list of courses

    
    Student getStudentsById(long studentId);
    //get student by id. return null if student not found


    Course getCourseById(long courseId);
    //get list of courses that the student is registered in

    List<Course> getCoursesOfStudent(long studentId);
    //registers the student in the course
    //@return tru if the registration was successful

    boolean addStudentToCourse(long studentId, long courseId);




}
