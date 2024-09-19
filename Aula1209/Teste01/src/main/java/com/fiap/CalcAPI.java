package com.fiap;

public class CalcAPI implements Calculator {

    private QueryAPI qApi;

    public void setAPI(QueryAPI api){
        qApi = api;
    }

    @Override
    public int soma(int valor1, int valor2) throws Exception {
        return qApi.validateSoma(valor1, valor2);
    }

    @Override
    public int divisaoInt(int valor1, int valor2) throws Exception {
        throw new UnsupportedOperationException("Unimplemented method 'divisaoInt'");
    }

    @Override
    public float divisao(int valor1, int valor2) throws Exception {
        throw new UnsupportedOperationException("Unimplemented method 'divisao'");
    }

    @Override
    public int multiplicacao(int valor1, int valor2) throws Exception {
        throw new UnsupportedOperationException("Unimplemented method 'multiplicacao'");
    }

    @Override
    public int subtracao(int valor1, int valor2) throws Exception {
        throw new UnsupportedOperationException("Unimplemented method 'subtracao'");
    }

}
