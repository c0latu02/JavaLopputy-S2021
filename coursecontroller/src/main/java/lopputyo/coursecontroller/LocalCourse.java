package lopputyo.coursecontroller;

public class LocalCourse extends Course{
    
    private String classRoom;

    int maxClassSize = 25;

    public LocalCourse(long courseIdCounter, String teacherName, String courseName, String classRoom) {
        super(courseIdCounter, teacherName, courseName);
        this.classRoom = classRoom;
    }


    public String getClassRoom() {
        return this.classRoom;
    }

    public void setClassRoom(String classRoom) {
        this.classRoom = classRoom;
    }


   @Override
   public boolean addStudent(Student student) {
        if(students.size() < maxClassSize){
       super.addStudent(student);
            return true;
        }
        else{
            return false;
        }
   }

   @Override
   public String toString() {
       return getCourseName() + " - " + getTeacherName()+ " - " + getClassRoom();
   }


   


    


}
