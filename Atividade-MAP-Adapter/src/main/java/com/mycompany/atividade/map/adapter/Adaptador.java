package com.mycompany.atividade.map.adapter;

public class Adaptador implements Alvo{
    
    private final ClasseAdaptada classeAdaptada;

    public Adaptador(ClasseAdaptada classeAdaptada) {
        this.classeAdaptada = classeAdaptada;
    }
    @Override
    public void operacao() {
        System.out.print("Adaptador: (Traduzido) ");
        classeAdaptada.operacaoEspecifica();   
    }
    
}
