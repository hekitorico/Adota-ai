import java.util.ArrayList;

public abstract class Animal {
    private String nome;
    private String especie;
    private int idade;
    private String codigoIdentificacao;
    private String ficha;
    private ArrayList<Object> carteiraVacinas;
    private boolean adotado;

    public Animal(String nome, String especie, int idade,
                  String codigoIdentificacao, String ficha,
                  ArrayList<Object> carteiraVacinas) {
        this.nome = nome;
        this.especie = especie;
        this.idade = idade;
        this.codigoIdentificacao = codigoIdentificacao;
        this.ficha = ficha;
        this.carteiraVacinas = carteiraVacinas;
        this.adotado = false;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getCodigoIdentificacao() {
        return codigoIdentificacao;
    }

    public void setCodigoIdentificacao(String codigoIdentificacao) {
        this.codigoIdentificacao = codigoIdentificacao;
    }

    public String getFicha() {
        return ficha;
    }

    public void setFicha(String ficha) {
        this.ficha = ficha;
    }

    public ArrayList<Object> getCarteiraVacinas() {
        return carteiraVacinas;
    }

    public void setCarteiraVacinas(ArrayList<Object> carteiraVacinas) {
        this.carteiraVacinas = carteiraVacinas;
    }

    public boolean getAdotado() {
        return adotado;
    }

    public void setAdotado(boolean adotado) {
        this.adotado = adotado;
    }

    public void serAdotado() {
        this.adotado = true;
    }

    public void exibirFicha() {
        System.out.println("Nome: " + nome);
        System.out.println("Espécie: " + especie);
        System.out.println("Idade: " + idade);
        System.out.println("Código de identificação: " + codigoIdentificacao);
        System.out.println("Ficha: " + ficha);
        System.out.println("Carteira de vacinas: " + carteiraVacinas);
        System.out.print("Adotado: ");
if (this.adotado){
System.out.println("Sim");
}
else{
System.out.println("Não");
}
    }
}
