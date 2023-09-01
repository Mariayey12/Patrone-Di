package Singleton;
public class AdminUser extends User {
    // Constructor
    public AdminUser(String username, String email, String password) {
        super(username, email, password);
    }

    // Métodos específicos para administradores
    public void promoteUserToAdmin(RegularUser regularUser) {
        // Lógica para promover a un usuario regular a administrador
    }
}

