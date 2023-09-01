package Singleton;

public class User {
    private String userName;
    private String email;
    private String pasword;

    public User(String userName, String email, String pasword) {
        this.userName = userName;
        this.email = email;
        this.pasword = pasword;
    }
    public String getUserName() {
        return userName;
    }

    public String getEmail() {
        return email;
    }

    public String getPasword() {
        return pasword;
    }
}