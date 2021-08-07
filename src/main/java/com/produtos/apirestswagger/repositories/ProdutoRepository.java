package com.produtos.apirestswagger.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.produtos.apirestswagger.models.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {

}
