package dev.castro.CadastroRpg.Personagens.Controller.Service;
import java.util.List;
import dev.castro.CadastroRpg.Itens.ItensModel;
import jakarta.persistence.*;

@Entity
@Table(name = "tb_cadastro")
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
    private String passado;
    private String historia;
    //um personagem tem varios itens
    @OneToMany(mappedBy = "personagem")
    @JoinColumn(name = "itens_id")                  //chave estrangeira
    private List<ItensModel> itens;

    public PersonagemModel() {
    }

    public PersonagemModel(String nome, String classe, int level, int idade, String raca, String alinhamento, String passado, String historia) {
        this.nome = nome;
        this.classe = classe;
        this.level = level;
        this.idade = idade;
        this.raca = raca;
        this.alinhamento = alinhamento;
        this.passado = passado;
        this.historia = historia;


    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String getClasse() {
        return classe;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public String getAlinhamento() {
        return alinhamento;
    }

    public void setAlinhamento(String alinhamento) {
        this.alinhamento = alinhamento;
    }

    public String getPassado() {
        return passado;
    }

    public void setPassado(String passado) {
        this.passado = passado;
    }

    public String getHistoria() {
        return historia;
    }

    public void setHistoria(String historia) {
        this.historia = historia;
    }
}
