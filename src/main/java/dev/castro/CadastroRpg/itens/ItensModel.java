package dev.castro.CadastroRpg.itens;

import dev.castro.CadastroRpg.personagens.PersonagemModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "tb_itens")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class ItensModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private char tier;
    private String nome;
    private String tipo;
    private Long danoMinimo;
    private Long danoMaximo;
    private String habilidades;
    private String historia;

    // Um item pertence a um personagem
    @ManyToOne
    @JoinColumn(name = "personagem_id")
    private PersonagemModel personagem;
}