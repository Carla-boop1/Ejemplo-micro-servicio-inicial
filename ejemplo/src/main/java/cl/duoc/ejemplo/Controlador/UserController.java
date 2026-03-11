package cl.duoc.ejemplo.Controlador;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cl.duoc.ejemplo.Modelo.User;
import cl.duoc.ejemplo.Repository.UserRepository;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;


@RestController
@RequestMapping("/usuarios")

public class UserController {

    private UserRepository datos;

    public UserController (){
        datos = new UserRepository();
    }

    @GetMapping("")
    public String test(){
        return "hola mundo";
    } 

    @GetMapping("/mostrarTodo")
    public List<User> mostrarTodo(){
        return datos.mostrar();
    }


}
