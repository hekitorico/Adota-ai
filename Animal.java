import java.util.ArrayList;

// Classe abstrata que representa um animal genérico.
public abstract class Animal {

    // Atributos comuns a todos os animais.
    private String nome;
    private String especie;
    private int idade;
    private String codigoIdentificacao;

    // Lista que armazena as vacinas do animal.
    // Object é utilizado temporariamente, pois a classe Vacina ainda não existe.
    private ArrayList<Object> carteiraVacinas;

    // Indica se o animal já foi adotado.
    private boolean adotado;

    // Construtor: inicializa os atributos do animal ao criar um objeto.
    public Animal(String nome, String especie, int idade,
                  String codigoIdentificacao,
                  ArrayList<Object> carteiraVacinas) {
        this.nome = nome;
        this.especie = especie;
        this.idade = idade;
        this.codigoIdentificacao = codigoIdentificacao;
        this.carteiraVacinas = carteiraVacinas;

        // Todo animal começa como não adotado.
        this.adotado = false;
    }

    // Retorna o nome do animal.
    public String getNome() {
        return nome;
    }

    // Altera o nome do animal.
    public void setNome(String nome) {
        this.nome = nome;
    }

    // Retorna a espécie do animal.
    public String getEspecie() {
        return especie;
    }

    // Altera a espécie do animal.
    public void setEspecie(String especie) {
        this.especie = especie;
    }

    // Retorna a idade do animal.
    public int getIdade() {
        return idade;
    }

    // Altera a idade do animal.
    public void setIdade(int idade) {
        this.idade = idade;
    }

    // Retorna o código de identificação do animal.
    public String getCodigoIdentificacao() {
        return codigoIdentificacao;
    }

    // Altera o código de identificação do animal.
    public void setCodigoIdentificacao(String codigoIdentificacao) {
        this.codigoIdentificacao = codigoIdentificacao;
    }

    // Retorna a lista de vacinas do animal.
    public ArrayList<Object> getCarteiraVacinas() {
        return carteiraVacinas;
    }

    // Altera a lista de vacinas do animal.
    public void setCarteiraVacinas(ArrayList<Object> carteiraVacinas) {
        this.carteiraVacinas = carteiraVacinas;
    }

    // Retorna true se o animal foi adotado e false caso contrário.
    public boolean getAdotado() {
        return adotado;
    }

    // Permite alterar o estado de adoção do animal.
    public void setAdotado(boolean adotado) {
        this.adotado = adotado;
    }

    // Marca o animal como adotado.
    public void serAdotado() {
        this.adotado = true;
    }

    // Exibe os dados gerais do animal no console.
    public void exibirFicha() {
        System.out.println("Nome: " + nome);
        System.out.println("Espécie: " + especie);
        System.out.println("Idade: " + idade);
        System.out.println("Código de identificação: " + codigoIdentificacao);
        System.out.println("Carteira de vacinas: " + carteiraVacinas);

        // Verifica se o animal foi adotado para exibir Sim ou Não.
        System.out.print("Adotado: ");
        if (this.adotado) {
            System.out.println("Sim");
        } else {
            System.out.println("Não");
        }
    }
}

