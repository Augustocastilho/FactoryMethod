package org.example;

public class TipoRoupaPraia implements ITipoRoupa{
    @Override
    public String roupa1() {
        return "Sunga vermelha";
    }

    @Override
    public String roupa2() {
        return "Camiseta branca com sunga preta";
    }

    @Override
    public String roupa3() {
        return "Sunga florida";
    }
}
