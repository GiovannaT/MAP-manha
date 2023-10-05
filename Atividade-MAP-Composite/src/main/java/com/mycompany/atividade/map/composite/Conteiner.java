package com.mycompany.atividade.map.composite;
import java.util.ArrayList;
import java.util.List;
public class Conteiner implements Componente{
    private final List<Componente> filhos = new ArrayList<>();

    public void adicionar(Componente componente) {
        filhos.add(componente);
    }

    public void remover(Componente componente) {
        filhos.remove(componente);
    }

    @Override
    public void operacao() {
        System.out.print("Composite (");
        for (Componente filho : filhos) {
            filho.operacao();
            System.out.print(" ");
        }
        System.out.print(")");
    }
}
