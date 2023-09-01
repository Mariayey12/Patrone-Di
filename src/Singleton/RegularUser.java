package Singleton;

public class RegularUser extends User {
    // Constructor
    public RegularUser(String username, String email, String password) {
        super(username, email, password);
    }

    // Métodos específicos para usuarios regulares
    public void sendMessageToAdmin(String message, AdminUser adminUser) {
        // Lógica para enviar un mensaje a un administrador
    }
}
