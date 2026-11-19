package padroesestruturais.flyweight;

public class TipoAmeaca {

    private String nome;
    private String categoria;
    private int severidade;

    public TipoAmeaca(String nome, String categoria, int severidade) {
        this.nome = nome;
        this.categoria = categoria;
        this.severidade = severidade;
    }

    public String getNome() {
        return nome;
    }

    public String getCategoria() {
        return categoria;
    }

    public int getSeveridade() {
        return severidade;
    }

}
