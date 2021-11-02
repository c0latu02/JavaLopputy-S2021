package lopputyo.coursecontroller;

import java.util.ArrayList;
import java.util.List;

public class Course {
    private long courseId;
    private String courseName;
    private String teacherName;
    
    private static long courseIdCounter = 0;

    public List<Student> students = new ArrayList<>();

    public void deleteStudent(Student student){

        students.remove(student);
    }

    public Course() {
        this(0, "", "");
    }

    public Course(long courseIdCounter, String courseName, String teacherName) {
        this.courseId = courseIdCounter++;
        this.courseName = courseName;
        this.teacherName = teacherName;
    }


    public long getCourseId() {
        return this.courseId;
    }

    public void setCourseId(long courseId) {
        this.courseId = courseId;
    }

    public String getCourseName() {
        return this.courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getTeacherName() {
        return this.teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public List<Student> getStudents() {
        return this.students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public boolean addStudent(Student student){
        return students.add(student);
        
    }

    public List<Student> getStudentList() {
        return new ArrayList<>(this.students);
    }

    
}
