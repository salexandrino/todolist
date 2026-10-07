package br.com.sthefanny.todolist.user;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController 
@RequestMapping("/users")


public class UserController {




    // Alterado: sem a barra final, a rota fica POST /users.
    @PostMapping
    public void create(@RequestBody UserModel userModel){
        // Alterado: usa o getter porque o campo name é privado em UserModel.
        System.out.println(userModel.getName());
    }


    
}
