package br.com.sthefanny.todolist;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TesteController {

    @GetMapping("/teste")
    public String testar() {
        return "Minha API está funcionando!";
    }
}