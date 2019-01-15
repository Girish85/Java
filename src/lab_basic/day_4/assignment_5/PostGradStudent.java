package lab_basic.day_4.assignment_5;

public class PostGradStudent extends Student {
    protected int postCourseId;
    protected String postCourseName;
    protected int postCourseFees;
    PostGradStudent(int postCourseId,String postCourseName,int postCourseFees,int studentId,char studentType,String studentName)
    {
        super(studentId,studentType,studentName);
        this.postCourseId = postCourseId;
        this.postCourseFees = postCourseFees;
        this.postCourseName = postCourseName;
    }
    public int getPostCourseId()
    {
        return postCourseId;
    }
    public String getPostCourseName()
    {
        return postCourseName;
    }
}
