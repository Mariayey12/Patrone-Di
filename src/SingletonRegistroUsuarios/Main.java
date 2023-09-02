package SingletonRegistroUsuarios;
import java.util.List;
//Este programa crea una instancia de UserRegistry,
// agrega usuarios a la lista, obtiene la lista completa de usuarios y
// busca un usuario por nombre de usuario utilizando los métodos que
// implementamos en la clase UserRegistry. Recuerda que debes tener una
// clase User con propiedades como username,
// email y password para que este programa funcione correctamente.


public class Main {
    public static void main(String[] args) {
        UserRegistry userRegistry = UserRegistry.getInstance();

        User user1 = new User("usuario1", "usuario1@example.com", "contraseña1");
        User user2 = new User("usuario2", "usuario2@example.com", "contraseña2");

        userRegistry.addUser(user1);
        userRegistry.addUser(user2);


        List<User> users = userRegistry.getUsers();
        for (User user : users) {
            System.out.println("Nombre de usuario: " + user.getUserName());
            System.out.println("Correo electrónico: " + user.getEmail());
            System.out.println("Contraseña: " + user.getPasword());

        }

        String usernameToFind = "usuario1";
        User foundUser = userRegistry.getUserByUserName(usernameToFind);
    }
}