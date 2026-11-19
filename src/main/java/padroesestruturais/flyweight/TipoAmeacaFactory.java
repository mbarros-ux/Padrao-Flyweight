package padroesestruturais.flyweight;

import java.util.HashMap;
import java.util.Map;

public class TipoAmeacaFactory {
    private static Map<String, TipoAmeaca> tipos = new HashMap<>();

    public static TipoAmeaca getTipoAmeaca(String nome, String categoria, int severidade) {
        TipoAmeaca tipo = tipos.get(nome);
        if (tipo == null) {
            tipo = new TipoAmeaca(nome, categoria, severidade);
            tipos.put(nome, tipo);
        }
        return tipo;
    }

    public static int getTotalTipos() {
        return tipos.size();
    }
}