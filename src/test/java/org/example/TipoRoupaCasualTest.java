package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TipoRoupaCasualTest {

    @Test
    void deveSelecionarRoupaCasual1() {
        ITipoRoupa tipoRoupa = TipoRoupaFactory.selecionarRoupa("Casual");
        assertEquals("Camisa de time com bermuda", tipoRoupa.roupa1());
    }

    @Test
    void deveSelecionarRoupaCasual2() {
        ITipoRoupa tipoRoupa = TipoRoupaFactory.selecionarRoupa("Casual");
        assertEquals("Camisa rosa com bermuda azul", tipoRoupa.roupa2());
    }

    @Test
    void deveSelecionarRoupaCasual3() {
        ITipoRoupa tipoRoupa = TipoRoupaFactory.selecionarRoupa("Casual");
        assertEquals("Camisa verde com bermuda amarela", tipoRoupa.roupa3());
    }
}