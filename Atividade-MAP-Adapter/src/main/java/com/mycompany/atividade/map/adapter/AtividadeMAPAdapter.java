package com.mycompany.atividade.map.adapter;
/**
 *
 * @author jhonnathan
 */
public class AtividadeMAPAdapter {

    public static void main(String[] args) {
        // Criando uma instância da Classe Adaptada
        ClasseAdaptada classeAdaptada = new ClasseAdaptada();

        // Criando um adaptador e passando a instância da Classe Adaptada
        Alvo adaptador = new Adaptador(classeAdaptada);

        // Chamando o método operacao da interface Alvo através do adaptador
        adaptador.operacao();   
    }
}
