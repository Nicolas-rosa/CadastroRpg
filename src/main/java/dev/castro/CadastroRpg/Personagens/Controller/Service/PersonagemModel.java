package dev.castro.CadastroRpg.Personagens.Controller.Service;
import java.util.List;
import dev.castro.CadastroRpg.Itens.ItensModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "tb_cadastro")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class PersonagemModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private int level;
    private String classe;
    private int idade;
    private String raca;
    private String alinhamento;
    private String aparencia;
    private String passado;
    private String historia;
    //um personagem tem varios itens
    @OneToMany(mappedBy = "personagem")
    @JoinColumn(name = "itens_id")                  //chave estrangeira
    private List<ItensModel> itens;

}
