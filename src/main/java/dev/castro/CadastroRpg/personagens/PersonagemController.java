package dev.castro.CadastroRpg.personagens;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class PersonagemController {

    @GetMapping("/boasVindas")
    public String boasVindas() {
        return "Essa é minha primeira mensagem nessa rota";
    }

}
