package com.danieldevop.patrimonio.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.danieldevop.patrimonio.model.Item;
import com.danieldevop.patrimonio.repository.ItemRepository;

@RestController
public class ItemResource {
	
	@Autowired
	private ItemRepository itemRepository;
	
	@GetMapping("/itens")
	public List<Item> listar() {
		return itemRepository.findAll();
	}
	
}
