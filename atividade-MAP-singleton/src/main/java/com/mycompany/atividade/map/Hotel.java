package com.mycompany.atividade.map;

public class Hotel {
    private static Hotel inicializar;
    private int quantidadeQuartos;
    private String nome;

    public Hotel(int quantidadeQuartos, String nome){
        this.nome = nome;
        this.quantidadeQuartos = quantidadeQuartos;
    }
  
    
    public static Hotel getInicializar() {
        if(inicializar == null){
            inicializar = new Hotel(200,"Exemplo Hotel");
        }
        return inicializar;
    }
    
    public static void setInicializar(Hotel inicializar) {
        Hotel.inicializar = inicializar;
    }

    public int getQuantidadeQuartos() {
        return quantidadeQuartos;
    }

    public void setQuantidadeQuartos(int quantidadeQuartos) {
        this.quantidadeQuartos = quantidadeQuartos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
