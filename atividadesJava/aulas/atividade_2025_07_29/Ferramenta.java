public class Ferramenta {
    private String nome;
    private int quantidade, id;
    private boolean ferramentaManual;
    private static int idTotal = 0;

    public Ferramenta(String nome, int quantidade, boolean ferramentaManual) {
        this.nome = nome;
        this.quantidade = quantidade;
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
        this.quantidade = quantidade;
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