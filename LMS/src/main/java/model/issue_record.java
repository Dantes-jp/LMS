package model;

public class issue_record {
    private String issueId;
    private String bookId;
    private String studentId;
    private String issueDate;
    private String returnDate;
    private String status;

    public issue_record(String issueId, String bookId, String studentId, String issueDate, String returnDate, String status) {
        this.issueId = issueId;
        this.bookId = bookId;
        this.studentId = studentId;
        this.issueDate = issueDate;
        this.returnDate = returnDate;
        this.status = status;
    }

    public String getIssueId() {
        return issueId;
    }

    public String getBookId() {
        return bookId;
    }

    public String getStudentId() {
        return studentId;
    }

    public String getIssueDate() {
        return issueDate;
    }

    public String getReturnDate() {
        return returnDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    
}
