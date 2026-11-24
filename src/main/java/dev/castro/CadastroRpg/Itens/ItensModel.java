package dev.castro.CadastroRpg.Itens;

import dev.castro.CadastroRpg.Personagens.Controller.Service.PersonagemModel;
import jakarta.persistence.*;

@Entity
@Table(name = "tb_itens")
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