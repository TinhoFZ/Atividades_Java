public class Ferramenta {
    private String nome;
    private int quantidade, id;
    private double preco;
    private boolean ferramentaManual;
    private static int idTotal = 0;

    public Ferramenta(String nome, int quantidade, double preco, boolean ferramentaManual) {
        this.nome = nome;
        this.quantidade = quantidade;
        this.preco = preco;
        this.ferramentaManual = ferramentaManual;
        id = idTotal;
        idTotal++;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        if (quantidade >= 0){
            this.quantidade = quantidade;
        } else {
            System.out.println("Quantidade negativa! A quantidade será '0'");
            this.quantidade = 0;
        }

    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        if (preco >= 0) {
            this.preco = preco;
        } else {
            System.out.println("Preço negativo! O preço será '0'");
            this.quantidade = 0;
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isFerramentaManual() {
        return ferramentaManual;
    }

    public void setFerramentaManual(boolean ferramentaManual) {
        this.ferramentaManual = ferramentaManual;
    }

    public String getNomeFerramentaManual() {
        if (ferramentaManual == true) {
            return "Ferramenta Manual";
        } else  {
            return "Ferramenta Elétrica";
        }
    }
}