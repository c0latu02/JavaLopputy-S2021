package lopputyo.coursecontroller;



public class OnlineCourse extends Course{
    
    private String url;

    
    public OnlineCourse(long courseIdCounter, String teacherName, String courseName, String url) {
        super(courseIdCounter, teacherName, courseName);
        this.url = url;
    }


    public String getUrl() {
        return this.url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public String toString() {
        return getCourseName() + " - "  + getTeacherName()+ " - "  + getUrl();
    }

}
