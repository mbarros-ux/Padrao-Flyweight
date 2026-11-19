package padroesestruturais.flyweight;

public class Ocorrencia {

    private String id;
    private String timestamp;
    private TipoAmeaca tipo;

    public Ocorrencia(String id, String timestamp, TipoAmeaca tipo) {
        this.id = id;
        this.timestamp = timestamp;
        this.tipo = tipo;
    }

    public String obterOcorrencia() {
        return "Ocorrencia{" +
                "id='" + this.id + '\'' +
                ", timestamp='" + this.timestamp + '\'' +
                ", tipo='" + tipo.getNome() + '\'' +
                ", categoria='" + tipo.getCategoria() + '\'' +
                ", severidade=" + tipo.getSeveridade() +
                '}';
    }
}