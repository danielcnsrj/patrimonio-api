package com.danieldevop.patrimonio.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.danieldevop.patrimonio.model.Item;

// O próprio spring criará a implementação da interface ao seguir a convenção
public interface ItemRepository extends JpaRepository<Item, Long> {

}
