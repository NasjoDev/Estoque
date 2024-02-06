package org.example;

public class Eletronico extends Produto{
    private String especificacao;
    public Eletronico(String  nome, int codigo, double preco, int quantidadeEmEstoque, String especificação) {
        super(nome, codigo, preco, quantidadeEmEstoque);
        this.especificacao = especificacao;
    }
    @Override
    public String toString() {
        return super.toString() +
                "\nEspecificação: " + especificacao +
                "\nTipo: Eletrônico";
    }
}
