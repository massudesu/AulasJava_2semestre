package br.com.senai.techbyte.service;

import br.com.senai.techbyte.model.Produto;
import br.com.senai.techbyte.repository.ProdutoRepository;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

public class ProdutoService {
    private final ProdutoRepository repository;

    public ProdutoService(ProdutoRepository repository) {
        this.repository = repository;
    }

    public Produto cadastrarProduto(String nome, String descricao, BigDecimal preco) {
        validarDadosProduto(nome, preco);

        if (preco.compareTo(new BigDecimal("5000.00")) >= 0 && !descricao.contains("[ALTO VALOR]")) {
            descricao = "[ALTO VALOR] " + descricao;
        }

        Produto novoProduto = new Produto(null, nome.trim(), descricao.trim(), preco);
        return repository.salvar(novoProduto);
    }

    public List<Produto> listarProdutos() {
        return repository.listarTodos();
    }

    public Optional<Produto> buscarPorId(Long id) {
        if (id == null || id <= 0) {
            throw new IllegalArgumentException("O ID informado deve ser um número positivo.");
        }
        return repository.buscarPorId(id);
    }



    public boolean atualizarProduto(Long id, String nome, String descricao, BigDecimal preco) {
        if (id == null || id <= 0) {
            throw new IllegalArgumentException("ID inválido para atualização.");
        }
        validardadosProduto(nome, preco);

        if (preco.compareTo(new BigDecimal("5000.00")) >= 0 && !descricao.contains("[ALTO VALOR]")) {
            descricao = "[ALTO VALOR] " + descricao;
        }
    }
}