package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TipoRoupaFactoryTest {

    @Test
    void deveRetornarExcecaoParaTipoRoupaInexistente() {
        try {
            ITipoRoupa tipoRoupa = TipoRoupaFactory.selecionarRoupa("Roupa íntima");
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Não existe esse tipo de roupa", e.getMessage());
        }
    }

    @Test
    void deveRetornarExcecaoParaServicoInvalido() {
        try {
            ITipoRoupa tipoRoupa = TipoRoupaFactory.selecionarRoupa("Academia");
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Roupa inválida", e.getMessage());
        }
    }
}