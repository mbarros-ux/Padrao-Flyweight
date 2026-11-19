package padroesestruturais.flyweight;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CentralMonitoramentoTest {

    @Test
    void deveRetornarOcorrencias() {
        CentralMonitoramento central = new CentralMonitoramento();
        central.registrar("OC001", "2026-11-20T10:00:00", "SQL Injection", "Web", 9);
        central.registrar("OC002", "2026-11-20T10:05:00", "SQL Injection", "Web", 9);
        central.registrar("OC003", "2026-11-20T10:10:00", "SQL Injection", "Web", 9);
        central.registrar("OC004", "2026-11-20T10:15:00", "DDoS", "Rede", 8);

        List<String> saida = Arrays.asList(
                "Ocorrencia{id='OC001', timestamp='2026-11-20T10:00:00', tipo='SQL Injection', categoria='Web', severidade=9}",
                "Ocorrencia{id='OC002', timestamp='2026-11-20T10:05:00', tipo='SQL Injection', categoria='Web', severidade=9}",
                "Ocorrencia{id='OC003', timestamp='2026-11-20T10:10:00', tipo='SQL Injection', categoria='Web', severidade=9}",
                "Ocorrencia{id='OC004', timestamp='2026-11-20T10:15:00', tipo='DDoS', categoria='Rede', severidade=8}");

        assertEquals(saida, central.obterOcorrencias());
    }

    @Test
    void deveRetornarTotalTipos() {
        CentralMonitoramento central = new CentralMonitoramento();
        central.registrar("OC001", "2026-11-20T10:00:00", "SQL Injection", "Web", 9);
        central.registrar("OC002", "2026-11-20T10:05:00", "SQL Injection", "Web", 9);
        central.registrar("OC003", "2026-11-20T10:10:00", "SQL Injection", "Web", 9);
        central.registrar("OC004", "2026-11-20T10:15:00", "DDoS", "Rede", 8);

        assertEquals(2, TipoAmeacaFactory.getTotalTipos());
    }
}