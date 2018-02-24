package com.danieldevop.patrimonio.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.danieldevop.patrimonio.model.Item;

public interface ItemRepository extends JpaRepository<Item, Long> {

}
