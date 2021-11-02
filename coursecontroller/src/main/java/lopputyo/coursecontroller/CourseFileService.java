package lopputyo.coursecontroller;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.springframework.stereotype.Service;


@Service
public class CourseFileService implements ICourseFileService {

    

    List<Student> students = new ArrayList<Student>();
    List<Course> courses = new ArrayList<Course>();

    String filePath1 = "files/students.txt";

    String filePath2 = "files/courses.txt";

    // String filePath1 = "./coursecontroller/files/students.txt";


    @Override
    public List<Student> readStudentsFromFile(String filePath1) throws FileNotFoundException {
        
        File f = new File(filePath1);
        Scanner sc = new Scanner(f);

        while (sc.hasNextLine()) {
            String[] studentInfo = sc.nextLine().split("---");
            Student s = new Student(Integer.parseInt(studentInfo[0]), studentInfo[1], studentInfo[2]);

            students.add(s);
        }
        sc.close();
        return students;
        
    }

    

    @Override
    public List<Course> readCoursesFromFile(String filePath2) throws FileNotFoundException {
        
        File f = new File(filePath2);
        Scanner sc = new Scanner(f);

        while (sc.hasNextLine()) {
            String[] courseInfo = sc.nextLine().split("---");
            Course c = new Course(Integer.parseInt(courseInfo[0]),courseInfo[1], courseInfo[2]);

            courses.add(c);
        }
        
        sc.close();
        return courses;
    }
}


     

    
    

