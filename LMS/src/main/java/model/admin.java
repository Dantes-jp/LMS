package model;

public class admin {
    private String adminId;
    private String password;
    
    public admin(String adminId, String password){
        this.adminId = adminId;
        this.password = password;
    }

    public String getAdminId() {
        return adminId;
    }

    public String getPassword() {
        return password;
    }
    
    
}
