package com.mycompany.atividade.map.composite;

public class Folha implements Componente{

    private int i;

    public Folha(int i) {
        this.i = i;
    }
    
    @Override
    public void operacao() {
        System.out.print("Folha "+i);
    }
}
