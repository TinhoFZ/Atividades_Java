import java.io.IOException;
import java.util.*;

public class Funcionario {
    private List<Ferramenta> estoque = new ArrayList<>();
    private Scanner input = new Scanner(System.in);
    private HashMap<Integer, Runnable> acoes = new HashMap<>();

    Funcionario(){
        acoes.put(1, () -> cadastrarFerramenta());
        acoes.put(2, () -> consultarEstoque());
        acoes.put(3, () -> atualizarQuantidade());
        acoes.put(4, () -> verEstoqueBaixo());
        acoes.put(5, () -> verTotal());
        acoes.put(6, () -> System.exit(0));
    }

    public void escolherAcao() {
        try{
            System.out.println("Que ação deseja realizar?: \n [1] Cadastrar ferramenta" +
                    "\n [2] Consultar o estoque \n [3] Atualizar estoque " +
                    "\n [4] Verificar estoque baixo \n [5] Calcular valor total" +
                    "\n [6] Sair");
            int escolha = input.nextInt();

            input.nextLine();
            acoes.get(escolha).run();
            escolherAcao();
        } catch (InputMismatchException ime){
            System.out.println("Informações indevidas foram inseridas! Retornando ao inicio.");
        }
    }

    public void cadastrarFerramenta(){
        try{
            System.out.println("Qual o nome da ferramenta?");
            String nome = input.nextLine();

            System.out.println("Quanto há de estoque?");
            int quantidade = input.nextInt();
            input.nextLine();

            System.out.println("Qual o preço da ferramenta?");
            double preco = input.nextDouble();


            System.out.println("A ferramenta é elétrica [0] ou manual [1]?");
            int escolha = input.nextInt();
            input.nextLine();

            if(escolha == 0){
                estoque.add(new Ferramenta(nome, quantidade, preco, false));
            } else if(escolha == 1){
                estoque.add(new Ferramenta(nome, quantidade, preco, true));
            } else {
                System.out.println("Insira um valor válido!");
            }

        } catch (InputMismatchException ime) {
            System.out.println("Informações indevidas foram inseridas! Retornando ao inicio.");
        }
    }

    public void consultarEstoque(){
        for (Ferramenta ferramenta : estoque) {
            System.out.println("Id: " + ferramenta.getId() + " | Nome: " + ferramenta.getNome() +
                    " | Quantidade: " + ferramenta.getQuantidade() + " | Tipo: " + ferramenta.getNomeFerramentaManual() +
                    " | Preço: " + ferramenta.getPreco());
        }

    }

    public void atualizarQuantidade(){
        try{
            System.out.println("Qual o id da ferramenta?");
            int ferramentaEscolhida = input.nextInt();
            input.nextLine();

            for(Ferramenta ferramenta : estoque){
                if(ferramenta.getId() == ferramentaEscolhida) {
                    System.out.println("Qual a quantidade atual do estoque?");
                    estoque.get(ferramentaEscolhida).setQuantidade(input.nextInt());
                    input.nextLine();
                }
            }
        } catch (InputMismatchException ime){
            System.out.println("Informações indevidas foram inseridas! Retornando ao inicio.");
        }
    }

    public void verEstoqueBaixo(){
        for(Ferramenta ferramenta : estoque){
            if(ferramenta.getQuantidade() < 5){
                System.out.println("Id: " + ferramenta.getId() + " | Nome: " + ferramenta.getNome() +
                        " | Quantidade: " + ferramenta.getQuantidade() + " | Tipo: " + ferramenta.getNomeFerramentaManual());
            }
        }
    }

    public void verTotal(){
        double estoqueTotal = 0, estoqueTotalManual = 0, estoqueTotalEletrico = 0;
        for(Ferramenta ferramenta : estoque){
            if(ferramenta.isFerramentaManual()){
                estoqueTotalManual += ferramenta.getPreco() * ferramenta.getQuantidade();
            } else {
                estoqueTotalEletrico += ferramenta.getPreco() * ferramenta.getQuantidade();
            }
            estoqueTotal += ferramenta.getPreco() * ferramenta.getQuantidade();
        }
        System.out.println("O preço total no sistema é: "  + estoqueTotal + "\n O preço total manual no sistema é: "  + estoqueTotalManual +
                "\n O preço total elétrico no sistema é: " + estoqueTotalEletrico);
    }
}
