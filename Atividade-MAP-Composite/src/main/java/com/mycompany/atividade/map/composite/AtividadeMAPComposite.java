/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividade.map.composite;

/**
 *
 * @author jhonnathan
 */
public class AtividadeMAPComposite {

    public static void main(String[] args) {
        Folha folha1 = new Folha(1);
        Folha folha2 = new Folha(2);
        Folha folha3 = new Folha(3);

        Conteiner composto1 = new Conteiner();
        composto1.adicionar(folha1);
        composto1.adicionar(folha2);

        Conteiner composto2 = new Conteiner();
        composto2.adicionar(composto1);
        composto2.adicionar(folha3);
        
        System.out.print("Resultado composto1: ");
        composto1.operacao();

        System.out.print("\nResultado composto2: ");
        composto2.operacao();    }
}
