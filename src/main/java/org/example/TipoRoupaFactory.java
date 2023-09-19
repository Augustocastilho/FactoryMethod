package org.example;

public class TipoRoupaFactory {

    public static ITipoRoupa selecionarRoupa(String tipoRoupa) {
        Class classe = null;
        Object objeto = null;
        try {
            classe = Class.forName("org.example.TipoRoupa"+tipoRoupa);
            objeto = classe.newInstance();
        } catch (Exception ex) {
            throw new IllegalArgumentException("Não existe esse tipo de roupa");
        }
        if (!(objeto instanceof ITipoRoupa)) {
            throw new IllegalArgumentException("Roupa inválida");
        }
        return (ITipoRoupa) objeto;
    }
}
