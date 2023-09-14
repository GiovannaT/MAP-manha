package com.mycompany.atividade.map.factory;

public class FormasGeometricasFactory {
    public FormasGeometricas criarForma(String tipo, double... parametros) {
        if (tipo.equalsIgnoreCase("retangulo") && parametros.length == 2) {
            return new Retangulo(parametros[0], parametros[1]);
        } else if (tipo.equalsIgnoreCase("circulo") && parametros.length == 1) {
            return new Circulo(parametros[0]);
        } else {
            throw new IllegalArgumentException("Tipo de forma geométrica não suportado ou parâmetros incorretos.");
        }
    }
}
