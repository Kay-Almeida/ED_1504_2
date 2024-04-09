package model;

public class Cliente {	
    private String nome;
    private int quantidadePecas;
    private float valorPecas;

    public Cliente(String nome, int quantidadePecas, float valorPecas) {
	    this.nome = nome;
	    this.quantidadePecas = quantidadePecas;
	    this.valorPecas = valorPecas;
	 }

     public String getNome() {
        return nome;
	 }

	 public int getQuantidadePecas() {
        return quantidadePecas;
     }

     public float getValorPecas() {
	     return valorPecas;
	 }
	}




