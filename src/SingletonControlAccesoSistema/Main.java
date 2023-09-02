package SingletonControlAccesoSistema;

import java.util.List;

//Este código implementa un sistema de control de acceso
// en Java aplicando el patrón Singleton. Permite agregar usuarios,
// puertas, cambiar el estado de las puertas y validar el acceso de
// un usuario a una puerta específica. Además,
// muestra el estado de las puertas y el resultado de la validación en la consola.
public class Main {
    public static void main(String[] args) {
        AccessControlSystem accessSystem = AccessControlSystem.getInstance();

        // Agregar usuarios al sistema
        User user1 = new User("user1", "password1");
        User user2 = new User("user2", "password2");
        accessSystem.addUser(user1);
        accessSystem.addUser(user2);

        List<User> users = accessSystem.getRegisteredUsers();
        for (User user : users) {
            System.out.println("\n Nombre de usuario: " + user.getUsername());
            System.out.println(" Contraseña: " + user.getPassword());
        }
        // Agregar puertas al sistema
        Door door1 = new Door("Door1");
        Door door2 = new Door("Door2");
        accessSystem.addDoor(door1);
        accessSystem.addDoor(door2);
        // Cambiar el estado de una puerta
        accessSystem.changeDoorState("Door1", true);
        // Recorrer la lista de puertas y mostrar sus estados
        System.out.println("\n Estado de las puertas:");
        for (Door door : accessSystem.getDoors()) {
            System.out.println("Puerta: " + door.getDoorId() + ", Estado: " + (door.isOpen() ? "Abierta" : "Cerrada"));
        }
        // Validar el acceso de un usuario a una puerta
        boolean accessGranted = accessSystem.validateAccess(user1, "Door1");
        if (accessGranted) {
            System.out.println("\nAcceso permitido a Door1 para user1");
        } else {
            System.out.println("\nAcceso denegado a Door1 para user1");
        }

    }
}