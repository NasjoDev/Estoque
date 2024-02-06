package org.example;

import java.util.ArrayList;


public class SistemaEstoque {
    private ArrayList<Produto> estoque = new ArrayList<>();
    public void adicionarProduto(Produto produto) {
        estoque.add(produto);
        System.out.println("Produto adicionado ao estoque: \n" + produto);
    }
    public void listaDeProdutos() {
        System.out.println("Lista de produtos em estoque: ");
        for (Produto produto : estoque) {
            System.out.println("---------------");
            System.out.println(produto);
        }
        System.out.println("---------------");
    }

    public void atualizarQuantidade( int codigo, int quantidade) {
        System.out.println("\n" + "--------------" + "\n" + "ATUALIZAR" + "\n");
        for (Produto produto : estoque) {
            if (produto.getCodigo() == codigo) {
                produto.setQuantidadeEmEstoque(quantidade);
                System.out.println("Quantidade do produto: " + produto.getNome() + "atualizada para " + quantidade);
            } else {
                System.out.println("Produto não encontrado com o código: " + codigo);
            }
        }

    }
    public void buscarPorCodigo(int codigo) {
        System.out.println("\n" + "--------------" + "\n" + "buscar" + "\n");
        for (Produto produto : estoque) {
            if (produto.getCodigo() == codigo) {
                System.out.println("Produto encontrado: " + produto);
                return;
            }
        }
        System.out.println("Produto não encontrado com o código: " + codigo);

    }
    public void removerProduto(int codigo) {
         for (Produto produto : estoque) {
             if(produto.getCodigo() == codigo) {
                 estoque.remove(produto);
                 System.out.println("Produto removido do estoque:" + produto);
                 return;
             }
         }
        System.out.println("Produto não encontrado com o código: " + codigo);
    }

    public static void main(String[] args) {
        SistemaEstoque sistema = new SistemaEstoque();
        Eletronico eletronico = new Eletronico("Smartphone ", 1, 999.99,10, "5G, 256GB");
        Roupa roupa = new Roupa("Camiseta", 2, 30.00,50,"G");
        sistema.adicionarProduto(eletronico);
        sistema.adicionarProduto(roupa);
        sistema.listaDeProdutos();
        sistema.atualizarQuantidade(3,10);
        sistema.buscarPorCodigo(2);
        sistema.removerProduto(1);
        sistema.listaDeProdutos();

    }

   }