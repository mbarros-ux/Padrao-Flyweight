package padroesestruturais.flyweight;

import java.util.ArrayList;
import java.util.List;

public class CentralMonitoramento {

    private List<Ocorrencia> ocorrencias = new ArrayList<>();

    public void registrar(String id, String timestamp, String nomeTipo, String categoria, int severidade) {
        TipoAmeaca tipo = TipoAmeacaFactory.getTipoAmeaca(nomeTipo, categoria, severidade);
        Ocorrencia ocorrencia = new Ocorrencia(id, timestamp, tipo);
        ocorrencias.add(ocorrencia);
    }

    public List<String> obterOcorrencias() {
        List<String> saida = new ArrayList<String>();
        for (Ocorrencia ocorrencia : this.ocorrencias) {
            saida.add(ocorrencia.obterOcorrencia());
        }
        return saida;
    }
}