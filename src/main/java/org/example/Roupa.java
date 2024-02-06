package org.example;

public class Roupa extends Produto{
    private String tamanho;
    public Roupa(String nome, int codigo, double preco, int quantidadeEmEstoque, String tamanho ) {
        super(nome, codigo, preco, quantidadeEmEstoque);
         this.tamanho = tamanho;
    }

    @Override
    public String toString(){
        return super.toString() +
                "\nTamanho: " + tamanho +
                "\nTipo: Roupa";
    }
}
