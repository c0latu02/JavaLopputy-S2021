package lopputyo.coursecontroller;


import java.io.FileNotFoundException;
import java.util.List;



public interface ICourseFileService  {
   
    //reads list of students from txt-file
    List<Student> readStudentsFromFile(String filePath1) throws FileNotFoundException;
        


    //reads list of courses from txt file
    List<Course> readCoursesFromFile(String filePath2) throws FileNotFoundException;

}

