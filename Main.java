import java.util.ArrayList;

// Classe principal do programa, responsável por executar os testes das metas .
public class Main {
    public static void main(String[] args) {

        // Cria uma lista vazia para armazenar as vacinas dos animais( ainda não implementamos).
        ArrayList<Object> vacinas = new ArrayList<>();

        // Cria um objeto Cachorro, seus dados e estado de adestramento.
        Cachorro cachorro = new Cachorro(
            "Joao", "Cachorro", 3, "C001", vacinas, true
        );

        // Cria um objeto Gato, seus dados e temperamento.
        Gato gato = new Gato(
            "Stella", "Gato", 2, "G001", vacinas, "Brincalhão"
        );

        // Testa a exibição da ficha do cachorro.
        System.out.println("TESTE CACHORRO");
        cachorro.exibirFicha();

        // Testa a exibição da ficha do gato.
        System.out.println("\n TESTE GATO");
        gato.exibirFicha();

        // Testa os getters, que retornam os valores dos atributos.
        System.out.println("\n TESTE GETTERS ");
        System.out.println("Nome do cachorro: " + cachorro.getNome());
        System.out.println("Adestrado: " + cachorro.getAdestracao());
        System.out.println("Nome do gato: " + gato.getNome());
        System.out.println("Temperamento: " + gato.getTemperamento());

        // Testa os setters, que alteram os valores dos atributos.
        System.out.println("\nTESTE DOS SETTERS");
        cachorro.setNome("Flora");
        cachorro.setAdestracao(false);
        gato.setNome("Musa");
        gato.setTemperamento("Calmo");
        gato.setIdade(4);

        // Exibe os valores atualizados para verificar os setters.
        System.out.println("Novo nome do cachorro: " + cachorro.getNome());
        System.out.println("Adestrado: " + cachorro.getAdestracao());
        System.out.println("Novo nome do gato: " + gato.getNome());
        System.out.println("Novo temperamento: " + gato.getTemperamento());
        System.out.println("Nova idade do gato: " + gato.getIdade());

        // Testa o método serAdotado(), que marca os animais como adotados.
        System.out.println("\nTESTE DE ADOÇÃO");
        cachorro.serAdotado();
        gato.serAdotado();

        // Exibe o estado de adoção de cada animal.
        System.out.println("Cachorro adotado: " + cachorro.getAdotado());
        System.out.println("Gato adotado: " + gato.getAdotado());

        // Exibe novamente as fichas com os dados atualizados.
        System.out.println("\nFICHAS ATUALIZADAS ");
        cachorro.exibirFicha();
        System.out.println();
        gato.exibirFicha();
    }
}
