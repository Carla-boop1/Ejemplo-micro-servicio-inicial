package cl.duoc.ejemplo.Repository;

import java.util.ArrayList;
import java.util.List;

import cl.duoc.ejemplo.Modelo.User;



public class UserRepository {
    private List<User> usuarios;

    public UserRepository(){
        usuarios = new ArrayList<>();
    }

    public void guardar(User u){
        usuarios.add(u);
    }

    public List<User> mostrar(){
        return usuarios;
    }
}
