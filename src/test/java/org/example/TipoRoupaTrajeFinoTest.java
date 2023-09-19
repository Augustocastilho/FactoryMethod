package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TipoRoupaTrajeFinoTest {

    @Test
    void deveSelecionarRoupaTrajeFino1() {
        ITipoRoupa tipoRoupa = TipoRoupaFactory.selecionarRoupa("TrajeFino");
        assertEquals("Terno preto com gravata borboleta", tipoRoupa.roupa1());
    }

    @Test
    void deveSelecionarRoupaTrajeFino2() {
        ITipoRoupa tipoRoupa = TipoRoupaFactory.selecionarRoupa("TrajeFino");
        assertEquals("Terno azul escuro", tipoRoupa.roupa2());
    }

    @Test
    void deveSelecionarRoupaTrajeFino3() {
        ITipoRoupa tipoRoupa = TipoRoupaFactory.selecionarRoupa("TrajeFino");
        assertEquals("Terno marrom com gravata", tipoRoupa.roupa3());
    }
}