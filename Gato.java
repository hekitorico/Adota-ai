import java.util.ArrayList;

public class Gato extends Animal {
     private String temperamento;

    public Gato(String nome, String especie, int idade,
                    String codigoIdentificacao, String ficha,
                    ArrayList<Object> carteiraVacinas,
                    String temperamento) {
        super(nome, especie, idade, codigoIdentificacao, ficha,
              carteiraVacinas);
         this.temperamento = temperamento;
    }

    public String getTemperamento() {
        return temperamento;
    }
  
 public void setTemperamento(String temperamento) {
        this.temperamento = temperamento;
    }
  
    @Override
    public void exibirFicha() {
        super.exibirFicha();
        System.out.println("Temperamento: " + temperamento);
    }
}
