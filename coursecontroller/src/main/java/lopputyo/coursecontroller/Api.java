package lopputyo.coursecontroller;

import java.io.FileNotFoundException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Api {

    String filePath1 = "files/students.txt";

    String filePath2 = "files/courses.txt";

    

    @Autowired
    CourseService courseService;

    @Autowired 
    CourseFileService courseFileService;

    @GetMapping()
    public String HelloWorld(){
    return "Hello World";
    }

    @GetMapping("/students")
    public List<Student> readStudentsFromFile() throws FileNotFoundException {
        courseService.setStudents(courseFileService.readStudentsFromFile(filePath1));
        return courseService.getStudents();
        
    }

    @GetMapping("/courses")
    public List<Course> readCoursesFromFile() throws FileNotFoundException {
        courseService.setCourses(courseFileService.readCoursesFromFile(filePath2));
        return courseService.getCourses();
    }
    
    @GetMapping("/students/{studentId}")
    public Student getStudentId(@PathVariable long studentId) {
        return courseService.getStudentsById(studentId);
    }

    @GetMapping("courses/{id}")
    public Course getCourseId(@PathVariable long courseId){
        return courseService.getCourseById(courseId);
    }




    

}
