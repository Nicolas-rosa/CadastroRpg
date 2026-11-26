package dev.castro.CadastroRpg.personagens;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class PersonagemService {
    private final PersonagemRepository personagemRepository;
}