package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TipoRoupaPraiaTest {

    @Test
    void deveSelecionarRoupaPraia1() {
        ITipoRoupa tipoRoupa = TipoRoupaFactory.selecionarRoupa("Praia");
        assertEquals("Sunga vermelha", tipoRoupa.roupa1());
    }

    @Test
    void deveSelecionarRoupaPraia2() {
        ITipoRoupa tipoRoupa = TipoRoupaFactory.selecionarRoupa("Praia");
        assertEquals("Camiseta branca com sunga preta", tipoRoupa.roupa2());
    }

    @Test
    void deveSelecionarRoupaPraia3() {
        ITipoRoupa tipoRoupa = TipoRoupaFactory.selecionarRoupa("Praia");
        assertEquals("Sunga florida", tipoRoupa.roupa3());
    }
}