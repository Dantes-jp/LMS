package model;

public class student {
    private String studentId;
    private String name;
    private String course;
    private String year;

    public student(String studentId, String name, String course, String year) {
        this.studentId = studentId;
        this.name = name;
        this.course = course;
        this.year = year;
    }

    public String getStudentId() {
        return studentId;
    }

    public String getName() {
        return name;
    }

    public String getCourse() {
        return course;
    }

    public String getYear() {
        return year;
    }
    
    
    
}
