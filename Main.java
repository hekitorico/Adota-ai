
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Vacina> vacinas = new ArrayList<>();

        Cachorro cachorro = new Cachorro(
            "Joao", "Cachorro", 3, "C001", vacinas, true
        );

        Gato gato = new Gato(
            "Stella", "Gato", 2, "G001", vacinas, "Brincalhão"
        );

        System.out.println("TESTE CACHORRO");
        cachorro.exibirFicha();

        System.out.println("\n TESTE GATO");
        gato.exibirFicha();

        System.out.println("\n TESTE GETTERS ");
        System.out.println("Nome do cachorro: " + cachorro.getNome());
        System.out.println("Adestrado: " + cachorro.getAdestracao());
        System.out.println("Nome do gato: " + gato.getNome());
        System.out.println("Temperamento: " + gato.getTemperamento());

        System.out.println("\nTESTE DOS SETTERS");
        cachorro.setNome("Flora");
        cachorro.setAdestracao(false);
        gato.setNome("Musa");
        gato.setTemperamento("Calmo");
        gato.setIdade(4);

        System.out.println("Novo nome do cachorro: " + cachorro.getNome());
        System.out.println("Adestrado: " + cachorro.getAdestracao());
        System.out.println("Novo nome do gato: " + gato.getNome());
        System.out.println("Novo temperamento: " + gato.getTemperamento());
        System.out.println("Nova idade do gato: " + gato.getIdade());

        System.out.println("\nTESTE DE ADOÇÃO");
        cachorro.serAdotado();
        gato.serAdotado();

        System.out.println("Cachorro adotado: " + cachorro.getAdotado());
        System.out.println("Gato adotado: " + gato.getAdotado());

        System.out.println("\n=== FICHAS ATUALIZADAS ===");
        cachorro.exibirFicha();
        System.out.println();
        gato.exibirFicha();
    }
}
