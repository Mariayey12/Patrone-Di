package SingletonControlAccesoSistema;

import java.util.ArrayList;
import java.util.List;


// Clase Singleton para el sistema de control de acceso
class AccessControlSystem {
    private static AccessControlSystem instance;
    private List<User> registeredUsers;
    private List<Door> doors;

    private AccessControlSystem() {
        registeredUsers = new ArrayList<>();
        doors = new ArrayList<>();
    }

    public static AccessControlSystem getInstance() {
        if (instance == null) {
            instance = new AccessControlSystem();
        }
        return instance;
    }

    public void addUser(User user) {
        registeredUsers.add(user);
    }

    public boolean validateAccess(User user, String doorId) {
        // Simulación de autenticación: Comprobar si el usuario está registrado y tiene permiso para abrir la puerta.
        if (registeredUsers.contains(user)) {
            for (Door door : doors) {
                if (door.getDoorId().equals(doorId) && door.isOpen()) {
                    return true;
                }
            }
        }
        return false;
    }

    public void changeDoorState(String doorId, boolean isOpen) {
        // Buscar la puerta por su ID y cambiar su estado.
        for (Door door : doors) {
            if (door.getDoorId().equals(doorId)) {
                door.setOpen(isOpen);
                return;
            }
        }
        // Si no se encuentra la puerta, se puede manejar el error aquí.
    }

    public void addDoor(Door door) {
        doors.add(door);
    }

    // Métodos para obtener la lista de usuarios y puertas
    public List<User> getRegisteredUsers() {
        return registeredUsers;
    }

    public List<Door> getDoors() {
        return doors;
    }
}