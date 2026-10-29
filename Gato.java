
import java.util.ArrayList;

// Classe Gato herda os atributos e métodos da classe Animal.
public class Gato extends Animal {

    // Atributo específico da classe Gato.
    private String temperamento;

    // Construtor que recebe os dados do gato e da classe Animal.
    public Gato(String nome, String especie, int idade,
                    String codigoIdentificacao, 
                    ArrayList<Object> carteiraVacinas,
                    String temperamento) {

        // Chama o construtor da classe Animal para inicializar os atributos herdados.
        super(nome, especie, idade, codigoIdentificacao,
              carteiraVacinas);

        // Inicializa o atributo específico do gato.
        this.temperamento = temperamento;
    }

    // Getter: retorna o temperamento do gato.
    public String getTemperamento() {
        return temperamento;
    }
  
    // Setter: permite alterar o temperamento do gato.
    public void setTemperamento(String temperamento) {
        this.temperamento = temperamento;
    }
  
    // Sobrescreve o método exibirFicha() da classe Animal.
    @Override
    public void exibirFicha() {

        // Exibe primeiro os dados gerais herdados da classe Animal.
        super.exibirFicha();

        // Exibe o temperamento específico do gato.
        System.out.println("Temperamento: " + temperamento);
    }
}
