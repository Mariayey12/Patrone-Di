package SingletonRegistroUsuarios;
import java.util.ArrayList;
import java.util.List;

//El patrón Singleton asegura que siempre
// haya una única instancia de UserRegistry en toda la aplicación

//UserRegistry es la clase Singleton que contiene la lista de usuarios.
public class UserRegistry {

    private List<User> users;
    private static UserRegistry instance;
    //El constructor UserRegistry es privado,
    // lo que significa que no se puede crear una instancia directamente
    // desde fuera de la clase.
    private UserRegistry() {
        users = new ArrayList<User>();
    }
    //getInstance() es un método estático
   // que proporciona la única instancia de UserRegistry.
    public static UserRegistry getInstance() {
        if (instance == null) {
            instance = new UserRegistry();
        }
        return instance;
    }
    //addUser(User user) agrega un usuario a la lista.
    public void addUser(User user){
        users.add(user);
    }

    //getUsers() devuelve la lista completa de usuarios.
    public List<User> getUsers(){
        return this.users;
    }
    //getUserByUsername(String username) busca un usuario por su nombre de usuario.
    public User getUserByUserName(String userName) {
        for (User user : this.users) {
            if (user.getUserName().equals(userName)) {
                return user;
            }
        }
        return null;
    }
}